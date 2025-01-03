# GPA Predictor
A web application to predict a student's GPA based on various factors using Spring Boot for the backend and a Python-based predictive model for GPA forecasting.
________________________________________
# Features
1.  User-Friendly Interface: Collects student information such as age, gender, parental education, study time, extracurricular activities, and more.
2.  GPA Prediction: Utilizes a Python predictive model trained on relevant student data to forecast GPA.
3.  Spring Boot Integration: Handles form submission, data processing, and integration with the Python model.
4.  Dynamic Data Handling: Processes user inputs, validates form fields, and ensures robust data flow between components.
________________________________________
# Tech Stack
•	Backend: Spring Boot Thymeleaf (for front-end templating)

•	Prediction Model: 	Python (trained model for GPA prediction)

•	Frontend: 	HTML/CSS (via Thymeleaf templates)
________________________________________
# Prerequisites
1.	Java: JDK 17 or higher.
2.	Spring Boot: Ensure Maven dependencies are configured.
3.	Python: Version 3.8 or higher.
4.	Dependencies: Install the required Python libraries (e.g., NumPy, pandas, scikit-learn).
5.	Environment Setup:
    o	Configure the Spring Boot application to invoke the Python script for predictions.
________________________________________
# Usage
1.	Home Page:
o	Navigate through the menu to start the GPA prediction process.
2.	Fill Out the Form:
o	Provide details such as age, gender, parental education, study hours, and extracurricular participation.
3.	Submit Data:
o	Upon submission, the data is processed and sent to the Python model.
4.	View Results:
o	The predicted GPA is displayed based on the provided inputs.
________________________________________
# Project Structure
Spring Boot (Java)<br>
1.  Controller: Handles form submission and coordinates with the Python script.
2.  Model: Represents the student data.
3.  Thymeleaf Templates: Provides the frontend for the form and results display.
   #  Python Predictive Model:
1.  Trained on student data to predict GPA.
2.  Integrated into the Spring Boot app using an API or subprocess calls.
