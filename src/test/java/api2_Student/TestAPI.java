package api2_Student;

import utility.APIRunner;
import org.junit.Test;

public class TestAPI {

    @Test
    public void utilTest(){
        APIRunner.runGET("http://api.cybertektraining.com/student/3783");

        String companyLocation = APIRunner.getResponse().getStudents().get(0).getCompany().getAddress().getCity();
        System.out.println(companyLocation);
    }
}
