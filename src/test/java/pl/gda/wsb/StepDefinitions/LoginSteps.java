package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.gda.wsb.PageFactory.DriverFactory;
import pl.gda.wsb.PageFactory.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = DriverFactory.getChromeDiver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("Open login page")
    public void openLoginPage() {
        driver = DriverFactory.getChromeDiver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User enters unsername and password")
    public void userEntersUnsernameAndPassword() {
        System.out.println("Users enters unsername and password");
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
