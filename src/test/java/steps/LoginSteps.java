package steps;

import gherkin.ast.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage login;
    public LoginSteps() {
        this.driver = Hooks.driver;
        login = new LoginPage(driver);
    }

    @Given("^User open SwagLabs Home Page$")
    public void user_open_swaglabs_home_page() throws Throwable {
        login.openHomePage();
    }

    @When("^He login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void he_login_with_something_and_something(String username, String password) throws Throwable {
        login.inputUserName(username)
                .inputPassWord(password)
                .clickBtnLogin();
    }

    @Then("^He should see \"([^\"]*)\" message$")
    public void he_should_see_something_message(String message) throws Throwable {
        login.seeErrorMessage(message);
    }
}
