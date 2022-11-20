package Myclinic.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Profile Page
	
	//Password
	@FindBy(name="password")
	WebElement Pword;
	
	@FindBy(id="inputCpassword")
	WebElement Confirmpassword;
	
	@FindBy(css=".btn.btn-block.badge-info.d-block.w-100")
	WebElement submit;
	
	@FindBy(xpath="//ul/li[4]/a")
	WebElement profilelink;
	
	//Action method
	public void goToProfilePage()

	{
		profilelink.click();
	}
	public void UpdateProfile(String Password,String CPassword)
	{
		Pword.sendKeys(Password);
		Confirmpassword.sendKeys(CPassword);
		submit.click();
		
	}
	
	
}
