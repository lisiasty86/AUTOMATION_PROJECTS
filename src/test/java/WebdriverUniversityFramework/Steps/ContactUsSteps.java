package WebdriverUniversityFramework.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
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
        /*ArrayList<String> windowHandles = (ArrayList<String>) driver.getWindowHandles();
        //windowHandles.add(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(2));
        windowHandles.clear();*/

        String windowHandle = driver.getWindowHandle();
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        //System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(1));

        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("Name1");
    }

    @And("^I enter a last name$")
    public void iEnterALastName() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys("LastName1");
    }

    @And("^I enter an email address$")
    public void iEnterAnEmailAddress() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("Name1_LastName1@gmail.com");
    }

    @And("^I enter comments$")
    public void iEnterComments() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys("This is some comment about this page bla bla bla \ntest new line");
    }

    @When("^I click on the submit button$")
    public void iClickOnTheSubmitButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
    }

    @Then("^the information should successfully be submitted via the contact us form$")
    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1")).isDisplayed());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.close();

        driver.quit();

    }

    @And("^I enter an inwalid email address$")
    public void iEnterAnInwalidEmailAddress() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("Name1_LastName1gmail.com");
    }

    @Then("^the information should not successfully be submitted via the contact us form$")
    public void theInformationShouldNotSuccessfullyBeSubmittedViaTheContactUsForm() throws Throwable {
        Assert.assertTrue(driver.getPageSource().contains("Error: Invalid email address"));

        driver.close();

        driver.quit();
    }
    
}
