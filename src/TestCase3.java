import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.AutomationExerciseUtil;
import utills.Driver;

import java.util.List;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        AutomationExerciseUtil.getAutomationExercise();

        WebElement subscriptionText = driver.findElement(By.cssSelector(".single-widget>h2"));
        WebElement emailInput = driver.findElement(By.id("susbscribe_email"));
        WebElement emailSearchButton = driver.findElement(By.id("subscribe"));
        WebElement text = driver.findElement(By.cssSelector("form[class='searchform'] p"));

        System.out.println(subscriptionText.isDisplayed() ? "PASSED": "FAILED");

        System.out.println(emailInput.isDisplayed() ? "PASSED": "FAILED");
        System.out.println(emailInput.getAttribute("placeholder").equals("Your email address") ? "PASSED": "FAILED");

        System.out.println(emailSearchButton.isDisplayed() && emailSearchButton.isEnabled() ? "PASSED": "FAILED");

        System.out.println(text.isDisplayed() && text.getText().equals("Get the most recent updates from" + "\nour site and be updated your self...") ? "PASSED": "FAILED");

        Driver.quitDriver();

    }
}
