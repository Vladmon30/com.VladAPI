package api0_MODELS_BEANS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
    /*
    @JsonIgnoreProperties(ignoreUnknown=true)--> using if in our JavaObject we have data that not present in Json
    (ex: String location)--> its not present
    we have only  int teacherid, String firstName, String lastName,int batch, String subject
    */

    /*
     @JsonInclude(JsonInclude.Include.NON_DEFAULT) --> using for include in our JavaObject only data that is not null or defult
      (and its showing us only this data that is not null or 0)
     */

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Teachers {
//{"teachers":[{"teacherId":1,"firstName":"]}   ----> List<Teachers> teachers
    int teacherid;
    String firstName;
    String lastName;
    int batch;
    String subject;
    String permanentAddress;

    public int getTeacherid() {
        return teacherid;
    }
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBatch() {
        return batch;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPermanentAddress() {return permanentAddress;}
    public void setPermanentAddress(String permanentAddress) {this.permanentAddress = permanentAddress;}
}