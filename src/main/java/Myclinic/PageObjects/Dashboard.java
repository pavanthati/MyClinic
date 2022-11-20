package Myclinic.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css=".btn.btn-block.btn-lg.badge-info.me-2")
	WebElement ReportIncident;
	
	public String ReportIncident()
	{
		String msg=ReportIncident.getText();
		return msg;
	}
}
