package api3_Mapping;



import api0_MODELS_BEANS.Teachers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class Mapping {

    @Test
    public void pojoMapping() throws IOException {

// We have String in a Json format
        String json = "{\"teacherid\":3,\"firstName\":\"Wooden\",\"lastName\":\"Spoon\",\"batch\":10,\"subject\":\"Corporate World\",\"location\":\"Chicago\"}";

// create ovject Mapper that comes from jackson library to convert Object to a Json format
        ObjectMapper objectMapper = new ObjectMapper();

// mapping this json String in our Teachers Class
        Teachers teachers = objectMapper.readValue(json,Teachers.class);

// print result of our mapping to a Teacher Class
// and now all our data in a Teacher Class take value of our String json!!!
        System.out.println(teachers.getFirstName());   // Wooden
        System.out.println(teachers.getLastName());    // Spoon
        System.out.println(teachers.getSubject());     // Corporate World
    }

    @Test
    public void objectToJson() throws JsonProcessingException {

 //set the value to Teacher Object
        Teachers teachers = new Teachers();

// we set not all value   by defult lastName will be " null " and batch will be " 0 ".
        teachers.setSubject("Intro to CS101");
        teachers.setTeacherid(34);
        teachers.setFirstName("Howard");

//convert Java to a Json
        ObjectMapper mapper = new ObjectMapper();

// insted fo readValue now we want to wright value as String
        String json = mapper.writeValueAsString(teachers);

// print the result
        System.out.println(json);
//{"teacherid":34,"firstName":"Howard","lastName":null,"batch":0,"subject":"Intro to CS101"}
// we can put result into online json viewer to look at it better

//-----------------------------------------------------------------
/*
   for showing to us only that attributes that have real value insted "null" or "0"
   we use
 */
}
}
