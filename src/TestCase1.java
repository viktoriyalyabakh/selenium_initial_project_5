import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.AutomationExerciseUtil;
import utills.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        AutomationExerciseUtil.getAutomationExercise();

        WebElement logo = driver.findElement(By.cssSelector("img[alt^='Website for']"));

        System.out.println(logo.isDisplayed() ? "PASSED": "FAILED");

        Driver.quitDriver();
    }
}
