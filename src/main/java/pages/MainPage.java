package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Definition

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown dropdown-login dropdown-tab']/a")
	WebElement LoginDropDownButton;
	@FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Login')]")
	WebElement LoginButton;
	@FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Sign Up')]")
	WebElement SignUpButton;
	@FindBy(how = How.XPATH, using = "//a[@id='dropdownLangauge']")
	WebElement LanguageDropdown;
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown dropdown-currency']/a[@id='dropdownCurrency']")
	WebElement CurrencyDropdown;

	// Interactive Methods

	public void ClickLoginDropDownButtonThenLogin() {
		LoginDropDownButton.click();
		LoginButton.click();
	}

	public void ClickLoginDropDownButtonThenSignUp() {
		LoginDropDownButton.click();
		SignUpButton.click();
	}

	// Vietnamese = vi / Russian = ru / English = en / Arabic = ar
	// French = fr / Spanish = es / German = de / Farsi = fa / Turkish = tr
	public void SelectLanguageFromDropdown(String Language) {
		LanguageDropdown.click();
		driver.findElement(By.id(Language)).click();
	}

	public void SelectCurrencyFromDropdown(String Currency) {
		CurrencyDropdown.click();
		driver.findElement(By.id(Currency)).click();
	}

}
