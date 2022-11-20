package Myclinic.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {

	WebDriver driver;
	public void AbstractComponents(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void waitforElementtoAppear(By findby) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
}
