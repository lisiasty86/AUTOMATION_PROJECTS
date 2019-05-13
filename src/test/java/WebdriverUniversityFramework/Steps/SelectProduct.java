package WebdriverUniversityFramework.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SelectProduct {

    WebDriver driver;

    @Given("^User navigate to \"([^\"]*)\"$")
    public void userNavigatesTo(String url) throws Throwable {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    @When("^User click on the Page Objcet Model$")
    public void userClickOnThePageObjectModel() throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]/h1")).click();
        System.out.println("Tytyul to:" + driver.getTitle());
    }


    @And("^User click \"([^\"]*)\"")
    public void userClick(String button1) {
        //

        /*String windowHandle = driver.getWindowHandle();
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        //System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(1));*/

        String winHandlerBefore = driver.getWindowHandle();

        for(String winHandler: driver.getWindowHandles()) {
            driver.switchTo().window(winHandler);
        }

        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println("Title of the switched page" + title);
        driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a")).click();
        //driver.findElement(By.cssSelector("#div-main-nav > div > ul > li:nth-child(2) > a")).click();

    }

    /*@And("^User select \"([^\"]*)\"container-special-offers\"")
    public void userSelect(String product)  throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container-special-offers\"]/div[1]/p")).click();
        driver.get(product);
    }*/

    /*@When("^The user should be presented with the following \"([^\"]*)\"$")
    public void theUserShouldBePresentedWithTheFollowing(String message) throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Assert.assertEquals(message.toLowerCase().replaceAll("\\s",""), alert.getText().toString().toLowerCase().replaceAll("\\s",""));

    }*/
    @And("User select \"([^\"]*)\"")
    public void userSelect(String product)  throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container-special-offers\"]/div[1]/p")).click();
        //driver.get(product);
    }

    @Then("^User click on \"([^\"]*)\"")
    public void userClickOn(String button2) throws Throwable {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        Alert alert = driver.switchTo().alert();
        System.out.println("Twoja Stara " + alert.getText());
        //driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
        driver.switchTo().alert().accept();
        driver.quit();
    }



}
