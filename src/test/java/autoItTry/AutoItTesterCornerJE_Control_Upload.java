
//https://thetesterscorner.com/upload-a-file-using-autoit-in-selenium/

package autoItTry;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItTesterCornerJE_Control_Upload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
//Instantiation of driver object. To launch Firefox browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

//To open URL "http://softwaretestingmaterial.com"
		driver.get("https://www.timesjobs.com/candidate/register.html?");

		WebElement ele = driver.findElement(By.id("resumeFile_basic"));

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("resumeFile_basic"))).click().build().perform();

		// or

//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", ele);
		System.out.println("Choose button is clicked");

// In AutoId Script
//ControlFocus(“title”,”text”,control ID)
//ControlSetText("title","text",control ID, "new text")
//ControlClick("File Upload","",Button1 )

//Runtime.getRuntime().exec("C:\Users\Tharosh\Documents\FileUpload.exe");
		Runtime.getRuntime().exec("C:\\Latha\\AutoItTry\\UploadFileJS.exe");
		System.out.println("File is upload through AutoIt");

//This close method will close the browser window
//driver.close();
	}

}