Project Title: Student Feedback Registration Form

Student Name: Shreya Gholase


---

Technologies Used:

* HTML
* CSS (Internal and External)
* JavaScript (Form Validation)
* Selenium (Java)
* Jenkins (Automation Tool)

---

Project Description:
This project is a Student Feedback Registration Form developed using HTML, CSS, and JavaScript. The form allows users to enter details such as student name, email ID, mobile number, department, gender, and feedback comments.

JavaScript is used to validate user inputs before submission to ensure correct data entry.

Selenium is used to automate testing of the form by checking various scenarios such as valid submission, invalid inputs, and button functionality.

Jenkins is used to automate the execution of Selenium test cases by integrating with a GitHub repository.

---

Features:

* User-friendly form interface
* Input validation using JavaScript
* Automated testing using Selenium
* Continuous integration using Jenkins

---

Validation Rules:

* Student Name should not be empty
* Email should be in proper format
* Mobile Number should contain valid 10 digits
* Department should be selected
* At least one gender option should be selected
* Feedback comments should contain minimum 10 words

---

Test Cases Implemented (Selenium):

1. Check whether the form page opens successfully
2. Enter valid data and verify successful submission
3. Leave mandatory fields blank and check error messages
4. Enter invalid email format and verify validation
5. Enter invalid mobile number and verify validation
6. Check dropdown selection functionality
7. Check Submit and Reset button functionality

---

How to Run the Project:

1. Open the Form:

   * Open index.html in any web browser

2. Run Selenium Test:

   * Compile:
     javac -cp ".;lib/*" FormTest.java
   * Run:
     java -cp ".;lib/*" FormTest

3. Jenkins Execution:

   * Jenkins is configured to fetch code from GitHub
   * Build step executes Selenium test cases automatically
   * Build status shows SUCCESS

---

Jenkins Configuration:

* Installed Jenkins
* Created Freestyle Project
* Connected GitHub repository
* Configured build step using Windows batch command
* Executed Selenium test cases through Jenkins

---

Output:

* All test cases executed successfully
* Jenkins build status: SUCCESS

---

Author:
Shreya Gholase


---
