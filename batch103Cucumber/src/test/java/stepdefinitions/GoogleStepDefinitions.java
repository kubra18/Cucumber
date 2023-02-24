package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;
public class GoogleStepDef {
    @Given("user google gider")
    public void user_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        try{

        }catch (Exception e){

        }
    }
    @When("user iphone icin arama yapar")
    public void user_iphone_icin_arama_yapar() {
    }
    @Then("user sonuclarda iphone oldugunu dogrular")
    public void user_sonuclarda_iphone_oldugunu_dogrular() {
    }
}
