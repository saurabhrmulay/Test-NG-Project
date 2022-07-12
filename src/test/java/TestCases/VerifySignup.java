package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage_Objects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignup extends BaseClass {
	@Test
	public void signUp() throws IOException, InterruptedException {
		
		LoginPage_Objects Lp=new LoginPage_Objects(driver);
		Lp.tryForFree().click();
		
		SignUpPageObjects Sp=new SignUpPageObjects(driver);
		Thread.sleep(5000);
		Sp.enterFirstName().sendKeys(Constants.firstname);
		Sp.enterLastName().sendKeys("Mulay");
	    Sp.enterWorkEmail().sendKeys("saurabh@gmail.com");
		
		Select s=new Select(Sp.selectJobTitle());
		s.selectByIndex(1);
		
		Sp.enterCompany().sendKeys("Technogeeks");
	    Sp.enterPhone().sendKeys("9922474896");
	    
		Select s1=new Select(Sp.selectEmployees());
		s1.selectByIndex(2);
}
}
