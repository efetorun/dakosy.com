package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;

public class DakosyStepdefinitions {

    @Given("Benutzer geht zu url")
    public void benutzer_geht_zu_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Bestätigt, dass die Url zugänglich ist")
    public void bestätigt_dass_die_url_zugänglich_ist() {
       String actualUrl= Driver.getDriver().getCurrentUrl();
       String expectedUrl="https://www.dakosy.de/";
        Assert.assertEquals(expectedUrl,actualUrl);

    }


}
