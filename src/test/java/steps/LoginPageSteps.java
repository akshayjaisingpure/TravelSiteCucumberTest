package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps extends BrowserSteps {
	
	WebDriver driver = init();
	LoginPage loginp = PageFactory.initElements(driver, LoginPage.class);

	@Then("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" and login$")
	public void user_enters_username_and_password_and_login(String username, String password) throws Throwable {

		loginp.Login(username, password);

	}

}
