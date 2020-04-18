package Steps;

import Pages.HomePage;
import io.cucumber.java.en.Then;


public class HomePageDefs {
    HomePage homePage = new HomePage();
    @Then("click {string} button")
    public void clickButton(String arg0) {
            homePage.clickButton(arg0);
        }

    @Then("click {string} button login")
    public void clickButtonLogin(String arg0) {
        homePage.clickButtonLogin(arg0);
    }
}

