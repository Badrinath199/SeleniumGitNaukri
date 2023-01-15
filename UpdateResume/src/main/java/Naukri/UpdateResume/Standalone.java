package Naukri.UpdateResume;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Standalone {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\K Badrinath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("usernameField")).sendKeys("kbadrinathrao@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("badri1997");
		driver.findElement(By.xpath("//button[contains(text(),'Login')][1]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'K Badrinath')]")).click();
	
		driver.findElement(By.xpath("//em[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.id("mob_number")).clear();
	
		driver.findElement(By.id("mob_number")).sendKeys("9777682378");
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		
		driver.findElement(By.id("attachCV")).sendKeys("F:\\Badri_Selenium_Resume.pdf");
		
	}


}
