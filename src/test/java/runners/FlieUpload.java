package runners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageLocators.DashboardPage;
import pageLocators.LoginPage;


public class FlieUpload {
	
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
	
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "OrangeHRM", "Title is Wrong please check the Title");
	}

	@BeforeMethod
	public void loginToApp() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		
		loginPage.enterUserName("Admin");
		
		loginPage.enterPassword("admin123");
		
		loginPage.clickSubmitButton();
		
		//Assert.assertTrue(dashboardPage.getUserNameText().contains("Welcome"), "Login credentials are incorrect");
	}
	
	
	@Test
	public void toUploadTheFile() throws InterruptedException, IOException {
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnAddAttachment")).click();
		
		Thread.sleep(2000);
		
		WebElement fileUpload = 
		driver.findElement(By.xpath("//*[@id=\"ufile\"]"));	
		
		
		
		Runtime.getRuntime().exec("drivers/FileUpload.exe");
		
	}

}
