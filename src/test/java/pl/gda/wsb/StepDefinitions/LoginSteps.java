package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = null;

    @Given("Open login page")
    public void openLoginPage() {
        // Declaration and instantiation of driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enters unsername and password")
    public void userEntersUnsernameAndPassword() {
        System.out.println("Users enters unsername and password");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin321321");
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("Click on login button");
        driver.findElement(By.className("orangehrm-login-button")).click();
    }

    @Then("The validation message is displayed")
    public void theValidationMessageIsDisplayed() {
        System.out.println("Validation message");
        String validation_message = driver.findElement(By.className("oxd-alert-content-text")).getText();
        System.out.println(validation_message);
    }
}
