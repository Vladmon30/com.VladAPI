package api4_Pojo;

import api0_MODELS_BEANS.Teachers;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class PojoTest {
    @Test
    public void testPojo() throws IOException {
// create an object from Teacher Class
        Teachers teachers = new Teachers();
// we set a value of attributes in Teacher Class
/*
    int teacherid;
    String firstName;
    String lastName;
    int batch;
    String subject;
 */
        teachers.setBatch(10);
        teachers.setFirstName("Vladyxa");
        teachers.setLastName("Mon");
        teachers.setTeacherid(7);
        teachers.setSubject("Java");

// comes from jakson library use jakson dependencies
// convert Object to Json format
        ObjectMapper objectMapper = new ObjectMapper();
//save results in a String format of Json
        String json = objectMapper.writeValueAsString(teachers);
        System.out.println(json); //{"teacherid":7,"firstName":"Vladyxa","lastName":"Mon","batch":10,"subject":"Java"}


// convert Json to Object format
        Teachers teachers2 = objectMapper.readValue(json,Teachers.class);
        System.out.println(teachers2.getFirstName());
        System.out.println(teachers2.getLastName());

    }
}
