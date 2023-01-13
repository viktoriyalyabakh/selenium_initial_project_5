import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.AutomationExerciseUtil;
import utills.Driver;
import utills.Waiter;

public class TestCase5 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        AutomationExerciseUtil.getAutomationExercise();

        driver.findElement(By.xpath("(//li)[5]/a")).click();

       System.out.println(driver.getCurrentUrl().equals("https://automationexercise.com/test_cases") ? "PASSED": "FAILED");
       System.out.println(driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases") ? "PASSED": "FAILED");

        Driver.quitDriver();

    }
}
