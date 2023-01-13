import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.AutomationExerciseUtil;
import utills.Driver;
import utills.Waiter;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        AutomationExerciseUtil.getAutomationExercise();

        String expectedFooter = "Copyright © 2021 All rights reserved";
        System.out.println(driver.findElement(By.cssSelector(".row>p")).getText().equals(expectedFooter) ? "PASSED": "FAILED");

        Driver.quitDriver();
    }
}
