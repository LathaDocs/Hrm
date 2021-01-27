
//https://thetesterscorner.com/upload-a-file-using-autoit-in-selenium/

package autoItTry;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
//Instantiation of driver object. To launch Firefox browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

//To open URL "http://softwaretestingmaterial.com"
		driver.get("https://www.timesjobs.com/candidate/register.html?");

		WebElement ele = driver.findElement(By.id("resumeFile_basic"));

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("resumeFile_basic"))).click().build().perform();

		StringSelection ss = new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	
	}

}