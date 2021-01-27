
// https://www.h2kinfosys.com/blog/file-upload-autoit-usage-with-selenium-webdriver/

package autoItTry;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItH2KInfosys {
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException, IOException {
//Instantiation of driver object. To launch Firefox browser
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//To open URL "http://softwaretestingmaterial.com"
driver.get("https://www.timesjobs.com/candidate/register.html?");
//Locating 'browse' button
WebElement browse =driver.findElement(By.id("resumeFile_basic"));
System.out.println("Get text of choose file" + browse.getText());

//The below line works -- to send by selenium webdriver
// By using Sendkeys method pass the path of the file to be uploaded Thread.sleep(3000);
//browse.sendKeys("C:\\Latha\\AutoItTry\\UploadFile.txt");
//System.out.println("the file path is send");

//To click on the 'browse' button
browse.click();
System.out.println("Choose button is clicked");


//To call the AutoIt script
Runtime.getRuntime().exec("C:\\Latha\\AutoItTry\\Uploadfile.exe");
System.out.println ("File is upload through AutoIt");

//This close method will close the browser window
//driver.close();
}

}