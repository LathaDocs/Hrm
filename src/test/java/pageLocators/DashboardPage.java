package pageLocators;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "welcome")
	private WebElement welcomeID;

	public boolean isWelcomeIdDisplayed() {
		return welcomeID.isDisplayed();
	}
}
