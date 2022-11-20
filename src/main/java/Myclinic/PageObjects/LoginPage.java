package Myclinic.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Myclinic.AbstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	//Login details
	//Username
	@FindBy(id="email")
	WebElement emailaddress;
	//Password
	@FindBy(id="userPassword")
	WebElement Password;
	//Submitbutton
	@FindBy(css=".mb-3")
	WebElement submit;
	
	//Action methods
	public void LoginintoApplication(String uname,String Pword)
	{
		emailaddress.sendKeys(uname);
		Password.sendKeys(Pword);
		submit.click();
		
	}
	
	public void goTo()
	{
		driver.get("http://202.53.80.226/myclinicsa/login");
	}
}
