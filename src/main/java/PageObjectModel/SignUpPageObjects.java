package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By lastName=By.xpath("//input[@name='UserLastName']");
	By workemail=By.xpath("//input[@name='UserEmail']");
	By JobTitle=By.xpath("//select[@name='UserTitle']");
	By Company=By.xpath("//input[@name='CompanyName']");
	By Phone=By.xpath("//input[@name='UserPhone']");
	By Employees=By.xpath("//select[@name='CompanyEmployees']");
	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
		public WebElement enterLastName() {
			return driver.findElement(lastName);
	}
		public WebElement enterWorkEmail() {
			return driver.findElement(workemail);
		}
	public WebElement selectJobTitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement enterCompany() {
		return driver.findElement(Company);
	}	
	public WebElement enterPhone() {
		return driver.findElement(Phone);
}
	public WebElement selectEmployees() {
		return driver.findElement(Employees);
	}
}


