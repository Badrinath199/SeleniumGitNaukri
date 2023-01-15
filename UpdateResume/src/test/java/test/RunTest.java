package test;



import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.ProfilePage;
import testComponent.BaseClass;

public class RunTest extends BaseClass {
	
	public String emailid="kbadrinathrao@gmail.com";
	public String password="badri1997";
		@Test (groups = {"phonenumber"})
		public void updatePhoneNumber()
		{
			HomePage homepage =lp.loginApplication(emailid, password);
			ProfilePage profilepage=homepage.profilepic();
			profilepage.editpage();
			profilepage.phoneNumber("9777682378");
		}
		@Test (groups= {"resume"}) 
		public void updateResume() throws InterruptedException
		{
			HomePage homepage =lp.loginApplication(emailid, password);
			ProfilePage profilepage=homepage.profilepic();
			profilepage.resume("C:\\Users\\K Badrinath\\eclipse-workspace\\UpdateResume\\src\\test\\java\\utility\\Badri_Selenium_Resume.pdf");
			
		}

	}


