package api2_Student;

import api0_MODELS_BEANS.CustomResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class SingleStudent {

    @Test
    public void customSingleStudent() throws IOException {
// We hit a single student http://api.cybertektraining.com/student/3783 --> Vlad
        Response response = RestAssured.get("http://api.cybertektraining.com/student/3783");
        System.out.println(response.statusCode());
        String json  = response.asString();
        System.out.println(json);

// we want to map our objectMapper from response into CustomResponse Class
        ObjectMapper objectMapper = new ObjectMapper();
        CustomResponse cr = objectMapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getStudents().get(0).getJoinDate());   // 08/08/198484
        System.out.println(cr.getStudents().get(0).getStudentId());  // 3783

    }

//-----------------------------------------------------------------------------------------------------------------------
    /* Task: 1. hit single student using RestAsured -->  from http://api.cybertektraining.com/student   // 3783--> Vlad
     2. print json response
     3. using pojo class called Students in apiModels_Beans package and added firstName, lastName variables
     4. generate get/set for both variables
*/
    @Test
    public void singleStudentVlad() throws IOException {

//1. hit single student using RestAsured -->  from http://api.cybertektraining.com/student   // 3783--> Vlad
        Response response = RestAssured.get("http://api.cybertektraining.com/student/3783");
        System.out.println(response.statusCode());

//2. print json response
        String json = response.asString();
        System.out.println(json);
//{"students":[{"studentId":3783,"firstName":"Vlad","lastName":"Mon","batch":10,"joinDate":"08/08/1984","birthDate":"08/08/1984","password":"string","subject":"string","gender":"male","admissionNo":"1","major":"string","section":"string","contact":{"contactId":3783,"phone":"string","emailAddress":"string","premanentAddress":"string"},"company":{"companyId":3783,"companyName":"string","title":"string","startDate":"string","address":{"addressId":3783,"street":"Rasher","city":"Chicago","state":"Illinois","zipCode":60656}}}]}


// we  mapp it (objectMapper)--> response into --> CustomResponse.class
// put this value in ObjectMapper to StudentVladPojo Class
        ObjectMapper objectMapper = new ObjectMapper();
        CustomResponse cr = objectMapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getStudents().get(0).getFirstName());
        System.out.println(cr.getStudents().get(0).getLastName());

//  3. I created create pojo class called StudentVladPojo in apiModels_Beans package and  added firstName, lastName variables
//  4. generate get/set for both variables
//--------------------------------------------------
//{"students":[{"studentId":3783,"firstName":"Vlad","lastName":"Mon","batch":10,"joinDate":"08/08/1984","birthDate":"08/08/1984","password":"string","subject":"string","gender":"male","admissionNo":"1","major":"string","section":"string",
// "contact":{"contactId":3783,"phone":"string","emailAddress":"string","premanentAddress":"string"},"company":{"companyId":3783,"companyName":"string","title":"string","startDate":"string","address":{"addressId":3783,"street":"Rasher","city":"Chicago","state":"Illinois","zipCode":60656}}}]}


        System.out.println(cr.getStudents().get(0).getFirstName());
        System.out.println(cr.getStudents().get(0).getLastName());
        System.out.println(cr.getStudents().get(0).getBatch());
        System.out.println(cr.getStudents().get(0).getJoinDate());

    }
}
