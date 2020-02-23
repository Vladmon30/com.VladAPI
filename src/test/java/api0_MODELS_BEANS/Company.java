package api0_MODELS_BEANS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Company {
  // Create object for using it in StudentLocation Class to get the value of  Student company object Address and find location city!!!
  // for that purpose we will create one more class StudentCompanyAddress

  // We put StudentCompanyAddress to StudentCompany Class to able use it and find city value in StudentLocation Class!!!
      private Address address;
      String title;

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

    public String getTitle() {return title; }

    public void setTitle(String title) { this.title = title; }
}
