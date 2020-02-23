package steps;

import api0_MODELS_BEANS.Students;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utility.APIRunner;

public class studentsVerify_Title_Email_steps {

//Task: write a scenario to test each students title. If title is enpty or one letter then fail.Feature:


    @When("user hit students API with {string}")
    public void user_hit_students_API_with(String string) {
        APIRunner.runGET("http://api.cybertektraining.com/student/all");
        APIRunner.getResponse().setJsonResponse(string);


    }

    @Then("user verifies each student title to be at least two letters")
    public void user_verifies_each_student_title_to_be_at_least_two_letters() {

        int counter = 0;
        for(Students students: APIRunner.getResponse().getStudents()) {
            String titles = students.getCompany().getTitle();
            System.out.println(titles);

            Assert.assertTrue("Student title is failing at index: " + counter+"", titles.length()>1|| titles!=null) ;
            counter++;
        }
    }

// Task: write a scenario to test each students email. If email is valid and contain both @ and . characters

        @Then("user verify each student email address to be valid")
        public void user_verify_each_student_email_address_to_be_valid() {

            int counter = 0;
            for(Students students: APIRunner.getResponse().getStudents()) {
                String emails = students.getContact().getEmailAddress();
                System.out.println(emails);

                Assert.assertTrue("Students email verify is fail at index: " +counter+"",emails.contains("@") && emails.contains("."));
                counter++;
            }

}

}
