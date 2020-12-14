package steps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import pages.MainPage;

public class MainPageSteps extends BrowserSteps {
	
	WebDriver driver;
	MainPage mainp;
	LoginPage loginp;
	
	@Before
	public void setup() {
		driver = init();
		driver.get("https://www.phptravels.net/home");
		mainp = PageFactory.initElements(driver, MainPage.class);
		loginp = PageFactory.initElements(driver, LoginPage.class);
		
		
	}
	
	@Test
	public void test() {
		mainp.ClickLoginDropDownButtonThenLogin();
		loginp.Login();
		
		
	}
	
	
	

}
