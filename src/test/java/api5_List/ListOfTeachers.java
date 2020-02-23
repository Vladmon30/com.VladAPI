package api5_List;

import api0_MODELS_BEANS.CustomResponse;
import api0_MODELS_BEANS.Teachers;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class ListOfTeachers {

    @Test
    public void listOfTeachers() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        System.out.println(response.statusCode());
// Everytime  we have object { } and inside this object we have array [] we  must use List <Array> array and generate Get/Set
//Ex: {"teachers":[{"teacherId":1,"firstName":"]}   ----> List<Teachers> teachers

// for that purpose we need :

// we  mapp it (objectMapper)--> response into --> CustomResponse.class
        ObjectMapper objectMapper = new ObjectMapper();
        CustomResponse cr = objectMapper.readValue(response.asString(), CustomResponse.class);

// after we mapp objectMapper response into CustomResponse.class we can simply use customResponse and get  List<Teachers> teachers
        System.out.println(cr.getTeachers().get(0).getSubject());  // get from teachers first teacher data of subject
        System.out.println(cr.getTeachers().size());
        System.out.println(cr.getTeachers().get(0).getFirstName());
        System.out.println(cr.getTeachers().get(0).getLastName());

//!!!! TASK!!!!
/*
     iterate through each Teacher that came from response and check each teachers subject.
     if subject value is null then print out the first and last name of teacher.
 */

// its gonna pass a list of teachers and will assign every single teacher into this list
        for (Teachers teachers : cr.getTeachers()) {
//            if (teachers.getSubject() == null) {   // hide it because all value is assign and not null
                System.out.println("First name: " + teachers.getFirstName() + ", Last name: " + teachers.getLastName());
                System.out.println("-----------------------------");
//            }
        }
    }
}




