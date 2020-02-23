package steps;

import runners.Runner;
import utility.APIRunner;
import utility.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    // Hooks class glue using glue= steps in runner class
    // using for precondition before scenario. For annotation or some precondition
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("This is running before each scenario");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed() && Driver.getDriverReference() !=null) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
// this method takes a screenshoot
            scenario.embed(screenshot,"image/png");
        }
//
        if(scenario.isFailed() && APIRunner.getCr()!=null){
            scenario.write(APIRunner.getResponse().getJsonResponse());
        }
    }
}