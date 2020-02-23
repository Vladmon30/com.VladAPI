Feature: Single Student API Automation
@singleStudent
  Scenario: Single Student Attribute validation
    When user hits single student API with "http://api.cybertektraining.com/student/3783"
    Then user checks for required attributes
