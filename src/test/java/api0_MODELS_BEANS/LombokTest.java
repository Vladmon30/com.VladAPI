package api0_MODELS_BEANS;

import lombok.Data;


// @Data --> comes from dependensy
/*
<dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.4</version>
            <scope>provided</scope>
        </dependency>
 */

// now using @Data --> lombok. we can just add annotation and not generate any more Get/Set its will do it automatically
// we can delete Get/Set from CustomResponse Class and add just @Data annotation to be able use Get/Set methods

@Data
public class LombokTest {
    String name;
    int age;

    public static void main(String[] args) {
        LombokTest lt = new LombokTest();

// Without @Data we not gona able to use set method we must generate firs Get/Set method
        lt.setName("Vlad");
        lt.setAge(35);

    }
}
