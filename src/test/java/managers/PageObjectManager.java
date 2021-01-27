package managers;

import org.openqa.selenium.WebDriver;

import pageLocators.*;

public class PageObjectManager {
	
	private WebDriver driver;

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private UserManagmentPage userManagmentPage;
	
	//To create an object of the pages
	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}
	

	public LoginPage getLoginPage(){
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public DashboardPage getDashboardPage(){
		return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
	}
	
	public UserManagmentPage getUserManagmentPage(){
		return (userManagmentPage == null) ? userManagmentPage = new UserManagmentPage(driver) : userManagmentPage;
	}
}


