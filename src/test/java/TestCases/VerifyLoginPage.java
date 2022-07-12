package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage_Objects;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyLoginPage extends BaseClass {
	
	@Test(dataProvider="testData")
	public void logInVerification(String username,String password) throws IOException {
		
		LoginPage_Objects Lp=new LoginPage_Objects(driver);
		Lp.enterUsername().sendKeys(username);
		Lp.enterPassword().sendKeys(password);
		Lp.clickOnLogin().click();
		
		
		
	}
	@DataProvider
	public Object[][]testData(){
		Object[][]data=new Object[2][2];
		data[0][0]=Constants.username1;
		data[0][1]=Constants.password1;
		data[1][0]=Constants.username2;
		data[1][1]=Constants.password2;
		
		return data;


}
}
