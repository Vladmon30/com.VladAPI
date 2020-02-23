$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/apiFeatures/studentsVerify_Title_Email.feature");
formatter.feature({
  "name": "Students title verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Student email verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@studentEmail"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user hit students API with \"http://api.cybertektraining.com/student/all\"",
  "keyword": "When "
});
formatter.match({
  "location": "studentsVerify_Title_Email_steps.user_hit_students_API_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify each student email address to be valid",
  "keyword": "Then "
});
formatter.match({
  "location": "studentsVerify_Title_Email_steps.user_verify_each_student_email_address_to_be_valid()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Students email verify is fail at index: 4\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat steps.studentsVerify_Title_Email_steps.user_verify_each_student_email_address_to_be_valid(studentsVerify_Title_Email_steps.java:45)\r\n\tat ✽.user verify each student email address to be valid(src/test/resources/apiFeatures/studentsVerify_Title_Email.feature:14)\r\n",
  "status": "failed"
});
formatter.write("http://api.cybertektraining.com/student/all");
formatter.after({
  "status": "passed"
});
});