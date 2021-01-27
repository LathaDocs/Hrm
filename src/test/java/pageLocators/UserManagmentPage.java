package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;

public class UserManagmentPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public UserManagmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//b[contains(text(),'Admin')]"))
	private WebElement adminTab;

	@FindBy(id = "menu_admin_UserManagement")
	private WebElement userManagementTab;

	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement menu_admin_viewSystemUsersMouseHover;

	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement userTabClick;

	public void mouseHoverOnUserManagement() {
		Actions action = new Actions(driver);
		// WebElement userManagementTab =
		// driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		action.moveToElement(adminTab).perform();
		action.moveToElement(userManagementTab).perform();
		System.out.println("user tab is");
		// WebElement userTabClick =
		// driver.findElement(By.id("menu_admin_viewSystemUsers"));
		userTabClick.click();

	}

	public boolean isSystemUserIsDisplayed() {
		// WebElement systemUser =
		// driver.findElement(By.id("menu_admin_viewSystemUsers"));
		return menu_admin_viewSystemUsersMouseHover.isDisplayed();

		// systemUser.click();
	}

	@FindBy(xpath = ("//a[contains(text(),'>')]"))
	private WebElement systemUsersTxt;

	public boolean isSystemUserTextIsDisplayed() {
		return systemUsersTxt.isDisplayed();

	}

}
