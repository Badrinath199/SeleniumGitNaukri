package testComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public LoginPage lp;
	public WebDriver driver= null;
	public WebDriver initialization()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K Badrinath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void lunchApp()
	{
		driver=initialization();
		lp=new LoginPage(driver);
		lp.getLandingPage();
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		driver.quit();
	}
}


