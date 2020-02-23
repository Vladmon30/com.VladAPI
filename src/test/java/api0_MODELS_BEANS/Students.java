package api0_MODELS_BEANS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Students {

//{ "students": [{"studentId": 3761, "firstName": "Vlad","lastName": "Mon","batch": 10}

     int studentId;
     String firstName;
     String lastName;
     int batch;
     String joinDate;
     private Contact contact;
// Create object StudentCompany for using it in Students Class to get the value of  Student company object Address and find location city!!!

// We put StudentCompany to Students Class to able use it  and find city value in StudentLocation Class!!!
     private Company company;


    public String getJoinDate() {return joinDate;}
    public void setJoinDate(String joinDate) {this.joinDate = joinDate;}

    public int getBatch() {return batch;}
    public void setBatch(int batch) {this.batch = batch;}

    public int getStudentId() {return studentId;}
    public void setStudentId(int studentId) {this.studentId = studentId;}

    public String getFirstName() {return firstName; }
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public Contact getContact() {return contact;}
    public void setContact(Contact contact) {this.contact = contact;}

    public Company getCompany() {return company;}
    public void setCompany(Company company) {this.company = company;}

}
