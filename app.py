# %%
from flask import Flask, request, jsonify
import numpy as np
import pickle

app = Flask(__name__)

# Load the model (update path as necessary)
model = pickle.load(open("D://Student_Performance//gpa_predictor_model.pkl", 'rb'))

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    # Extract features from JSON and predict
    features = np.array([[
    data['age'],
    data['gender'],
    data['ethnicity'],
    data['parentalEducation'],
    data['studyTimeWeekly'],
    data['absences'],
    data['tutoring'],
    data['parentalSupport'],
    data['extracurricular'],
    data['sports'],
    data['music'],
    data['volunteering']
]])
    prediction = model.predict(features)
    return jsonify(float(prediction[0]))

if __name__ == '__main__':
    app.run(port=5000)



