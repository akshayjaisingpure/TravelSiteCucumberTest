package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import pages.AccountPage;

public class AccountPageSteps extends BrowserSteps {
	
	WebDriver driver = init();
	AccountPage accp = PageFactory.initElements(driver, AccountPage.class);
	
	@Then("User will land on the account page")
	public void user_will_land_on_the_account_page() throws Throwable {
		
		Thread.sleep(500);
		assertEquals("Title does not Matche" ,"Dashboard - Best Halal Trip", driver.getTitle());
		
	}
}
