package api0_MODELS_BEANS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)


//reason we create that class it can handle every single response we dont need to create many classes its all will be here
// class for any Response

public class CustomResponse {


// now using @Data --> lombok. we can just add annotation and not generate any more Get/Set its will do it automatically
// we can delete Get/Set from CustomResponse Class and add just @Data annotation to be able use Get/Set methods


    private String firstName;
    private String lastName;
    private List<Contact> contact;
    private List<Students> students;

    //verytime  we have object { } and inside this object we have array [] we  must use List <Array> array and generate Get/Set
//Ex: {"teachers":[{"teacherId":1,"firstName":"]}   ----> List<Teachers> teachers


    private List<Teachers> teachers;
    private Company company;
    private Address address;

// comes from Utility Class we use it fo sending report if scenario is fail its attached all the data from failed tests
    private String jsonResponse;




    public String getJsonResponse() {return jsonResponse; }
    public void setJsonResponse(String jsonResponse) { this.jsonResponse = jsonResponse;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) { this.lastName = lastName;}

    public List<Contact> getContact() {return contact;}
    public void setContact(List<Contact> contact) {this.contact = contact;}

    public List<Students> getStudents() { return students;}
    public void setStudents(List<Students> students) { this.students = students; }

    public List<Teachers> getTeachers() {return teachers;}
    public void setTeachers(List<Teachers> teachers) {this.teachers = teachers;}

    public Company getCompany() {return company;}
    public void setCompany(Company company) {this.company = company; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address;}



}
