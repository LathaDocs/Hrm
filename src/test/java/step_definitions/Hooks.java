package step_definitions;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;
	public Hooks(TestContext context){
		testContext = context;
	}
	
	@Before
	public void BeforeSteps(){
//		 webDriverManager = new WebDriverManager();
//		 driver = webDriverManager.getDriver();
	}
	
	@After
	public void AfterSteps() throws InterruptedException{
		testContext.getWebDriverManager().quiteDriver();
	}

//	@SuppressWarnings("deprecation")
//	@Before
//	public void openBrowser(){
//		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");	
//		
//		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		//options.addArguments("disable-extensions") ;
//		DesiredCapabilities capability=new DesiredCapabilities() ;
//		//capability = DesiredCapabilities.chrome();
//		capability.setCapability(ChromeOptions.CAPABILITY, options); 
//		
//		
//		driver = new ChromeDriver(capability);
//		driver.manage().deleteAllCookies();		
//		driver.manage().window().maximize();
//		
//	}
//	
//	@After
//	public void tearDown() throws InterruptedException{
//		Thread.sleep(3000);
//		driver.quit();
//	}
}
