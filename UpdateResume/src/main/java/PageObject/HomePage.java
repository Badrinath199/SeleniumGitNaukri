package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;
	
	public class HomePage extends AbstractComponent{
		WebDriver driver;
		public HomePage(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//div[contains(text(),'K Badrinath')]")
		WebElement profilename;
		
		public ProfilePage profilepic()
		{
			profilename.click();
			ProfilePage profilepage=new ProfilePage(driver);
			return profilepage;
		}
	
	}

