package api0_MODELS_BEANS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public class Address {

 // We looking for city value inside StudentCompanyAddress in StudentCompany in Students object
 /* {
    "students": [
        {
            "studentId": 3783,
            "firstName": "Vlad",
            "lastName": "Mon",
            "batch": 10
            "contact": {
                "contactId": 3783,
                "phone": "string"
            },
            "company": {
                "companyId": 3783,
                "companyName": "string",
                "address": {
                    "addressId": 3783,
                    "street": "Rasher",
                    "city": "Chicago",
                    "state": "Illinois",
                    "zipCode": 60656
 }}}
    ]
}
*/
 // We put String city in StudentCompanyAddress Class to connect StudentCompany Class to be able use it and find city value in StudentLocation Class!!!
        private String city;

        public String getCity() {return city;}
        public void setCity(String city) {this.city = city;}
}
