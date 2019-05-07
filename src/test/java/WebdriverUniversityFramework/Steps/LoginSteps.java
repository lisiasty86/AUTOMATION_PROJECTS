package WebdriverUniversityFramework.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    /*@Before()
    public void setup() throws IOException {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }*/

    /*@Given("^I access webdriveruniversity2$")
    public void iAccessWebdriveruniversity() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("http://www.webdriveruniversity.com/index.html");
    }



    @When("^I click on the login portal button$")
    public void iClickOnTheLoginPortalButton() throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();
        //System.out.println("Login Portal");
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


    @And("^I enter a \"([^\"]*)\" pass$")
    public void iEnterAPass(String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("webdriver123");
    }

    @And("^I enter a \"([^\"]*)\" password$")
    public void iEnterAPassword(String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("webdriver");
    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("^I should be presented with a successful validation alert$")
    public void iShouldBePresentedWithASuccessfulValidationAlert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals("validation succeeded", alert.getText());

        //driver.close();
        driver.quit();
    }

    @Then("^I should be presented with a unsuccessful validation alert$")
    public void iShouldBePresentedWithAUnsuccessfulValidationAlert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        //actual expects
        Assert.assertEquals("validation failed", alert.getText());

        //driver.close();
        driver.quit();
    }*/

    @Given("^user navigates to \"([^\"]*)\"$")
    public void userNavigatesTo(String url) throws Throwable {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    @When("^user clicks on the login portal button$")
    public void userClicksOnTheLoginPortalButton() {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();
        //System.out.println("Login Portal");

    }

    @And("^user enter the \"([^\"]*)\" username$")
    public void userEnterTheUsername(String username) throws Throwable {
        @SuppressWarnings("unused")
        String winHandlerBefore = driver.getWindowHandle();

        for(String winHandler: driver.getWindowHandles()) {
            driver.switchTo().window(winHandler);
        }

        driver.findElement(By.id("text")).sendKeys(username);
    }

    @And("^user enter the \"([^\"]*)\" password$")
    public void userEnterThePassword(String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    @When("^user clicks on the login button$")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("^the user should be presented with the following prompt alert \"([^\"]*)\"$")
    public void theUserShouldBePresentedWithTheFollowingPromptAlert(String message) throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        //actual expects
        Assert.assertEquals(message.toLowerCase().replaceAll("\\s",""), alert.getText().toString().toLowerCase().replaceAll("\\s",""));
        driver.quit();
    }

}
