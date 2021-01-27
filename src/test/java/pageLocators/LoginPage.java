package pageLocators;

import dataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	private WebElement userNameField;

	@FindBy(id = "txtPassword")
	private WebElement passwordField;

	@FindBy(id = "btnLogin")
	private WebElement submitButton;

	public void enterUserName(String userName) {
		userNameField.clear();
		userNameField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void navigateToOrangeHRMPortal(){
		configFileReader = new ConfigFileReader();
		driver.get(configFileReader.getApplicationUrl());
	}

	public void clickSubmitButton() {
		submitButton.click();
	}
}
