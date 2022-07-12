package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Objects {
	public WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By logIn=By.xpath("//input[@id='Login']");
	By tryFree=By.xpath("//a[@id='signup_link']");
	
	public LoginPage_Objects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	

}
	public WebElement clickOnLogin() {
		return driver.findElement(logIn);
	
}
	public WebElement tryForFree() {
		return driver.findElement(tryFree);
	
}
} 