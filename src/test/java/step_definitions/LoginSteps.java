package step_definitions;

import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageLocators.DashboardPage;
import pageLocators.LoginPage;
import pageLocators.UserManagmentPage;

public class LoginSteps {
	TestContext testContext;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	UserManagmentPage userManagmentPage;

	public LoginSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManger().getLoginPage();
		dashboardPage = testContext.getPageObjectManger().getDashboardPage();
		userManagmentPage = testContext.getPageObjectManger().getUserManagmentPage();
	}

	@Given("^user navigates to Orange HRM portal$")
	public void user_navigates_to_Orange_HRM_portal() throws Throwable {
		loginPage.navigateToOrangeHRMPortal();
	}

	@When("^user enter his username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_his_username_as_and_password(String username, String password) throws Throwable {
		// String uName = ExcelUtils.getCellData(0, 0);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		loginPage.clickSubmitButton();

	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed() throws Throwable {
		Assert.assertTrue(dashboardPage.isWelcomeIdDisplayed());
	}

	@Given("^user is logged into the application$")
	public void user_is_logged_into_the_application() throws Throwable {
		loginPage.navigateToOrangeHRMPortal();
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickSubmitButton();

	}

	@When("^user click on the Admin tab and select User Management and Users$")
	public void user_click_on_the_Admin_tab_and_select_User_Management_and_Users() throws Throwable {
		userManagmentPage.mouseHoverOnUserManagement();

	}

	@Then("^User should re-directed to the User Management page$")
	public void user_should_re_directed_to_the_User_Management_page() throws Throwable {
		// System.out.println("System User is found" + userManagmentPage.gettext() )
		// System.out.println("Price : "+price.getText() + price.getTagName());
		System.out.println("System User is found : " + userManagmentPage.isSystemUserTextIsDisplayed());
		// Object systemUserValue = (System.out.println("System User is found : " +
		// userManagmentPage.isSystemUserIsDisplayed()));
		Assert.assertTrue(userManagmentPage.isSystemUserTextIsDisplayed());

	}

}
