
// https://www.h2kinfosys.com/blog/file-upload-autoit-usage-with-selenium-webdriver/

package autoItTry;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItH2K_Try {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
//Instantiation of driver object. To launch Firefox browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

//To open URL "http://softwaretestingmaterial.com"
		driver.get("https://www.timesjobs.com/candidate/register.html?");
//Locating 'browse' button

//https://sqa.stackexchange.com/questions/43090/how-to-click-button-which-doesnt-have-button-tag-getting-invalidargumentexcept
//below code 

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("resumeFile_basic"))).click().build().perform();

//The below line works -- to send by selenium webdriver
// By using Sendkeys method pass the path of the file to be uploaded Thread.sleep(3000);
//browse.sendKeys("C:\\Latha\\AutoItTry\\UploadFile.txt");
//System.out.println("the file path is send");

//To click on the 'browse' button
//browse.click();
		System.out.println("Choose button is clicked");

// https://selenium-training-way2automation.blogspot.com/2013/04/uploading-file-using-autoit-webdriver.html

		// Process process = new ProcessBuilder("C:\\Latha\\AutoItTry\\Uploadfile.exe",
		// "C:\\Latha\\AutoItTry\\UploadFile.txt", "Open").start();

		// (or)

//To call the AutoIt script
		Runtime.getRuntime().exec("C:\\Latha\\AutoItTry\\Uploadfile.exe");
		System.out.println("File is upload through AutoIt");

		Thread.sleep(5000);

		// Click the upload form submit button.
		driver.findElement(By.id("resumeFile_basic")).click();

		Thread.sleep(3000);
		System.out.println("File button is clicked");

//This close method will close the browser window
//driver.close();
	}

}