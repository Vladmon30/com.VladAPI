package api2_Student;

import api0_MODELS_BEANS.Students;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;


//!!!!!!! Class not pass the test, because of issue with long and hard Json format in "http://api.cybertektraining.com/student/create"
// Use it please only for example of structure API metods Post(Create the object)

public class PostStudent {
    @Test
    public void postStudent(){

/* Create object from Students Class from apiModels_Beans package where we store our attributes in a Java Object format:
        private int studentId;
        private String firstName;
        private int batch;
        String joinDate;
        String lastName;
*/
        Students student= new Students();

// {"studentId": 3783,"firstName": "Vlad","lastName": "Mon","batch": 10}

//set the value of our attributes:
        student.setFirstName("Maryna");
        student.setLastName("Monchanova");
        student.setBatch(10);


// next we go back to postman take url for creating a student --> http://api.cybertektraining.com/student/create
// and put it in Rest Asured but first we should specify content(format in what we will use this value)
// in our case its Json
// but if we do not specify it will give us an error!!!


// choose a format in what we will save our data --> Json
        Response response = RestAssured.given().contentType(ContentType.JSON).body(student).when().post("http://api.cybertektraining.com/student/create");
// print result of what student we create
        System.out.println(response.statusCode());
    }

}
