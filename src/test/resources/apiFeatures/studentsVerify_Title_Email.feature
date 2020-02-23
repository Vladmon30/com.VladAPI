
  Feature: Students title verification

# Task: write a scenario to test each students title. If title is empty or one letter then fail.Feature:
  @studentTitle
    Scenario: Check title of all students
      When user hit students API with "http://api.cybertektraining.com/student/all"
      Then user verifies each student title to be at least two letters

# Task: write a scenario to test each students email. If email is valid and contain both @ and . characters
    @studentEmail
    Scenario: Student email verification
      When user hit students API with "http://api.cybertektraining.com/student/all"
      Then user verify each student email address to be valid
