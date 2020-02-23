package api2_Student;

import api0_MODELS_BEANS.CustomResponse;
import api0_MODELS_BEANS.Students;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class StudentLocation {
    @Test
    public void studentCompanyAddress() throws IOException {

// This API for bring a list of Students to automation
        Response response =  RestAssured.get("http://api.cybertektraining.com/student/all");

// create ovject Mapper that comes from jackson library to convert Object to a Json format
        ObjectMapper objectMapper = new ObjectMapper();

// we mapping our response int CustomResponseForAll Class
// also we need create a List<Students> students in CustomResponse Class to be able use it
        CustomResponse cr = objectMapper.readValue(response.asString(), CustomResponse.class);

//now we can manipulate the data in Students list


// lets check how many students we have in our list?
        System.out.println(cr.getStudents().size());  //256

// using forEach loop iterate all StudentsCompany in StudentsCompanyAddress and find the city!!!
        int counter = 0;
        for(Students students : cr.getStudents()){
            System.out.println(students.getFirstName());
            if(students.getCompany().getAddress().getCity().contentEquals("Chicago")){
                System.out.println(students.getFirstName());
                counter++;
            }
        }
        System.out.println("Total: " + counter);




    }

}
