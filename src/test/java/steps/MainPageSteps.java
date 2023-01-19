package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps extends BrowserSteps {

	WebDriver driver;
	MainPage mainp;

	@Before
	public void setup() {

		driver = init();
		mainp = PageFactory.initElements(driver, MainPage.class);

	}

	@Given("User is on the the main website page")
	public void user_is_on_the_the_main_website_page() throws Throwable {

		driver.get("https://www.phptravels.net");
	}

	@When("User clicks on login they should be directed to the login page")
	public void user_clicks_on_login_they_should_be_directed_to_the_login_page() throws Throwable {

		mainp.ClickLoginDropDownButtonThenLogin();
	}

	@After
	public void TearDown() {
		CloseBrowser();
	}

}
