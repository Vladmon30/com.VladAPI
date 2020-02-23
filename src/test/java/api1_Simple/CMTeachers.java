package api1_Simple;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

public class CMTeachers {

// create test list of all teachers
    @Test
    public void teacherAll(){
        Response response  = RestAssured.get("http://api.cybertektraining.com/teacher/all");
// print all of teachers list as String
        System.out.println(response.asString());

// Task: we should verify that every single attribute have a value and its not a null!!!

// get value of single attribute
        JsonPath jsonPath = response.jsonPath();

// but we need check all of attributes in an API what we hit
/*      teachers
        0
        firstName : "Madham"
        lastName : "Mask"
        emailAddress : "jackma@gmail.com"
        password : "test"
        phone : "7727453232"
        subject : "Into to Database"
        batch : 10
*/
//{"teachers":[{"teacherId":1,"firstName":"Madham","lastName":"Mask","emailAddress":"jackma@gmail.com","joinDate":"12/31/2009","password":"test","phone":"7727453232","subject":"Into to
        String sub = jsonPath.get("teachers[0].subject");
        System.out.println(sub);
        System.out.println("----------------------");

        List <String> subjects = jsonPath.get("teachers.subject");
// to make sure we have all info we will check the size of list
        System.out.println(subjects.size());

        for(String subj: subjects){
            if(subj.isEmpty()){
                System.out.println(subj);
            }
        }
    }
    }
