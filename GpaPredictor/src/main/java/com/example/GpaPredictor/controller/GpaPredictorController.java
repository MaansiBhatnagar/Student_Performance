package com.example.GpaPredictor.controller;

import com.example.GpaPredictor.model.StudentData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class GpaPredictorController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("studentData", new StudentData());
        return "gpaForm";
    }

    @PostMapping("/predictGPA")
    public String predictGPA(StudentData studentData, Model model) {
        RestTemplate restTemplate = new RestTemplate();

        // URL of the Python model API endpoint
        String pythonApiUrl = "http://localhost:5000/predict";

        // Send the studentData as a JSON request to the Python API
        Double predictedGpa = restTemplate.postForObject(pythonApiUrl, studentData, Double.class);

        model.addAttribute("predictedGpa", predictedGpa);
        return "gpaResult";
    }
}
