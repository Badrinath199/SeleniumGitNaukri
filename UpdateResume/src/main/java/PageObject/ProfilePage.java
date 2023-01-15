package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;

public class ProfilePage extends AbstractComponent{
		WebDriver driver;
		public ProfilePage(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//em[contains(text(),'Edit')]")
		WebElement edit;
		
		@FindBy(id="mob_number")
		WebElement number;
		
		@FindBy(id="saveBasicDetailsBtn")
		WebElement savebtn;
		
		@FindBy(id="attachCV")
		WebElement cvupdate;
		
		
		public void editpage()
		{
			edit.click();
		}
		
		public void phoneNumber(String num)
		{
			number.clear();
			number.sendKeys(num);
			savebtn.click();
		}
		
		public void resume(String path) throws InterruptedException
		{
			Thread.sleep(3000);
			cvupdate.sendKeys(path);
			Thread.sleep(3000);
		}
}
