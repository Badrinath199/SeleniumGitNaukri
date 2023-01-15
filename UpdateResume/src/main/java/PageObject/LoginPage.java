package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;

public class LoginPage extends AbstractComponent{
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="usernameField")
	WebElement username1;
	
	@FindBy(id="passwordField")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')][1]")
	WebElement submit;
	
	public void getLandingPage()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
	}
	
	public HomePage loginApplication(String email, String pass)
	{
		username1.sendKeys(email);
		password.sendKeys(pass);
		submit.click();
		HomePage homepage= new HomePage(driver);
		return homepage;
	}

}
