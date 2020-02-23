package api0_MODELS_BEANS;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Contact {
//{"students":[{"studentId":3783,"firstName":"Vlad","lastName":"Mon","batch":10,"joinDate":"08/08/1984","birthDate":"08/08/1984","password":"string","subject":"string","gender":"male","admissionNo":"1","major":"string","section":"string",
// "contact":{"contactId":3783,"phone":"string","emailAddress":"string","premanentAddress":"string"},"company":{"companyId":3783,"companyName":"string","title":"string","startDate":"string","address":{"addressId":3783,"street":"Rasher","city":"Chicago","state":"Illinois","zipCode":60656}}}]}

    private int contactId;
    private String phone;
    private String emailAddress;

    public int getContactId() {return contactId;}
    public void setContactId(int contactId) {this.contactId = contactId;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getEmailAddress() {return emailAddress;}
    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}


}
