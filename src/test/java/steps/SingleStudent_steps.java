package steps;

import utility.APIRunner;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SingleStudent_steps {

    @When("user hits single student API with {string}")
    public void user_hits_single_student_API_with(String uri) {

// This line of code hit API using API Runner Class from utility using runGet method
        APIRunner.runGET(uri);


    }

    @Then("user checks for required attributes")
    public void user_checks_for_required_attributes() {

        System.out.println(APIRunner.getResponse().getStudents().get(0).getFirstName());
        System.out.println(APIRunner.getResponse().getStudents().get(0).getLastName());


        Assert.assertTrue("Student first name is missing",APIRunner.getResponse().getStudents().get(0).getFirstName()!=null);
        Assert.assertTrue("Student last name is missing",APIRunner.getResponse().getStudents().get(0).getLastName()!=null);

        Assert.assertTrue("Student email address is missing",APIRunner.getResponse().getStudents().get(0).getContact().getEmailAddress()!=null);
        Assert.assertTrue("Student company city is missing",APIRunner.getResponse().getStudents().get(0).getCompany().getAddress().getCity()!=null);

    }


}
