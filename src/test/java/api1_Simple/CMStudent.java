package api1_Simple;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class CMStudent {

// create test list of all students
    @Test
    public void studentList(){

// Open the browser with our link and save it in response
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
/*
    alternative way to get response
    RestAssured.given().get("http://api.cybertektraining.com/student/all").then().statusCode(200);
    RestAssured.get("http://api.cybertektraining.com/student/all").then().equals(200); --> same like previous
*/

// check is it pass test with code 200 or not!!!
        Assert.assertEquals(response.statusCode(),200);

// show us all list of students in Online Json viewer
// result of String we can put in online viewer (http://jsonviewer.stack.hu/) and see json format of result
        System.out.println(response.asString());
    }

/*
    Task: Create a test hit API that gets only one student. Print out status and response in string
*/
    @Test
    public void singleStudent(){

// get response from API for only one specific student with id 3722(Vlad)
        Response response = RestAssured.get("http://api.cybertektraining.com/student/3761");

// print status code
        System.out.println(response.statusCode());

// check if its hit API successfully
        Assert.assertEquals(response.statusCode(),200);

// print response in a String format
        System.out.println(response.asString());

// JsonPath --> help get value from one specific attribute (in our case value of "batch" attrib from student "VLad")
        JsonPath jp = response.jsonPath();

//{"students":[{"studentId":3722,"firstName":"Vlad","lastName":"Mon","batch":10}]
// use path for API from internet
        int batch = jp.get("students[0].batch");

// print this value of "batch" attribute
        System.out.println("batch value is: " + batch);

// get first name from single student
        String firstName = jp.get("students[0].firstName");
        System.out.println("firstName value is " + firstName);
//{"students":[{"studentId":3722,"firstName":"Vlad","lastName":"Mon","batch":10,"contact":{"company":{"address":{"street":"Rasher","city":"Chicago","state":"Illinois","zipCode":60656}}}]}
        String street = jp.get("students[0].company.address.street");
        System.out.println("steet value is: " + street);

// find zip code:

        int zipCode = jp.get("students[0].company.address.zipCode");
        System.out.println("zipCode is: " + zipCode);


    }





}
