package WebdriverUniversityFramework.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    //WebDriver driver;

    /*@Before()
    public void setup() throws IOException {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }*/

    /*@When("^I click on the login portal button$")
    public void iClickOnTheLoginPortalButton() throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();
        System.out.println("Login Portal");
    }

    @And("^I enter a username$")
    public void iEnterAUsername() throws Throwable {
        @SuppressWarnings("unused")
        String winHandlerBefore = driver.getWindowHandle();

        for(String winHandler: driver.getWindowHandles()) {
            driver.switchTo().window(winHandler);
        }

        driver.findElement(By.id("text")).sendKeys("webdriver");
    }

    @And("^I enter a \"([^\"]*)\" password$")
    public void iEnterAPassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be presented with a successful validation alert$")
    public void iShouldBePresentedWithASuccessfulValidationAlert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be presented with a unsuccessful validation alert$")
    public void iShouldBePresentedWithAUnsuccessfulValidationAlert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
