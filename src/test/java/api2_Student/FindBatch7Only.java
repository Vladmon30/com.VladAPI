package api2_Student;

import utility.APIRunner;
import api0_MODELS_BEANS.Students;
import org.junit.Test;

public class FindBatch7Only {

/*
   Task:  Create the test and using APIRunner find all students name from batch7
 */
    //("http://api.cybertektraining.com/student/all");

    @Test
    public void Test(){
        APIRunner.runGET("http://api.cybertektraining.com/student/all");
        int count = 0;
        for(Students students : APIRunner.getCr().getStudents()){
            if(students.getBatch()==7){
                System.out.println(students.getFirstName());
                count++;
            }
        }
        System.out.println("Total batch 7 students: " + count );
    }
}
