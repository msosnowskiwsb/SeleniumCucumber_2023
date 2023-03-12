package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pl.gda.wsb.PageFactory.DriverFactory;
import pl.gda.wsb.PageFactory.LoginPage;

public class LoginSteps {

    WebDriver driver = DriverFactory.getChromeDiver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("Open login page")
    public void openLoginPage() {
        driver = DriverFactory.getChromeDiver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }

    @When("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        System.out.println("Users enters username and password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("Click on login button");
        loginPage.clickOnLogin();
    }

    @Then("^The validation (.*) is displayed$")
    public void theValidationMessageIsDisplayed(String message) {
        System.out.println("Validation message");
        Assert.assertEquals(message,loginPage.getValidationMessage());
    }
}
