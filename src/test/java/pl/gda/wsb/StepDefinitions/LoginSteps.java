package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.gda.wsb.PageFactory.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = null;
    LoginPage loginPage;

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
        loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin321321");
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("Click on login button");
        loginPage.clickOnLogin();
    }

    @Then("The validation message is displayed")
    public void theValidationMessageIsDisplayed() {
        System.out.println("Validation message");
        Assert.assertEquals("Invalid credentials",loginPage.getValidationMessage());
    }
}
