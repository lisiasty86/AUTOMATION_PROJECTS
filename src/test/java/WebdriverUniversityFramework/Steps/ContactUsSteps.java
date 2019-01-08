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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ContactUsSteps {

    WebDriver driver;

    @Before()
    public void setup() throws IOException {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("^I access webdriveruniversity$")
    public void iAccessWebdriveruniversity() {
        driver.get("http://www.webdriveruniversity.com/index.html");
    }

    @When("^I click on the contact us button$")
    public void iClickOnTheContactUsButton() throws Throwable {
        driver.findElement(By.id("contact-us")).click();
    }

    @And("^I enter a first name$")
    public void iEnterAFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.selectWindow("name=NewPage");
        System.out.println("This is the page with title: "+driver.getTitle());
        driver.switchTo().window("WebDriver | Contact Us");
        System.out.println("This is the page with title2: "+driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("lisek");
    }

    @And("^I enter a last name$")
    public void iEnterALastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter an email address$")
    public void iEnterAnEmailAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter comments$")
    public void iEnterComments() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the submit button$")
    public void iClickOnTheSubmitButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the information should successfully be submitted via the contact us form$")
    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
/*
    @And("^I enter a non valid first name$")
    public void iEnterANonValidFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter a non valid last name$")
    public void iEnterANonValidLastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter an non valid email address$")
    public void iEnterAnNonValidEmailAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter no comments$")
    public void iEnterNoComments() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the information should not be successfully be submitted via the contact us form$")
    public void theInformationShouldNotBeSuccessfullyBeSubmittedViaTheContactUsForm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user should also be notified of the problem$")
    public void theUserShouldAlsoBeNotifiedOfTheProblem() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
