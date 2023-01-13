package utills;

import org.openqa.selenium.WebDriver;

public class AutomationExerciseUtil {

    public static void getAutomationExercise(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
    }
}
