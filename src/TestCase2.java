import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.AutomationExerciseUtil;
import utills.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        AutomationExerciseUtil.getAutomationExercise();

        List<WebElement> headers = driver.findElements(By.cssSelector(".col-sm-8 li"));
        String[] headersText = {"Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};

        int i = 0;
        for (WebElement header : headers) {
            System.out.println(header.isDisplayed());
            System.out.println(header.isEnabled());
            System.out.println(header.getText().trim().equals(headersText[i++]));
        }
        Driver.quitDriver();
    }
}
