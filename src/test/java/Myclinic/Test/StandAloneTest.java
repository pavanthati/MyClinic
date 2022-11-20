package Myclinic.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Myclinic.PageObjects.Dashboard;
import Myclinic.PageObjects.LoginPage;
import Myclinic.PageObjects.ProfilePage;
import Myclinic.resources.BaseTest;

public class StandAloneTest extends BaseTest {

	@Test(testName = "LoginwithrightData")
	public void LoginTest() {

		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.goTo();
		LoginPage.LoginintoApplication("ram.user@cattechnologies.com", "123456789ee");
		Dashboard Dashboard = new Dashboard(driver);
		String title = Dashboard.ReportIncident();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(title, "Report Incident");
		System.out.println(title);
	}

	@Test(testName = "LoginwithworngData")
	public void LoginTestt() {

		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.goTo();
		LoginPage.LoginintoApplication("ram.user@cattechnologies.com", "12345678d9");
		SoftAssert softAssert = new SoftAssert();
		Dashboard Dashboard = new Dashboard(driver);
		String title = Dashboard.ReportIncident();
		softAssert.assertEquals(title, "Report Incident");
		System.out.println(title);

	}

	@Test(testName = "ProfiledataUpdate")
	public void UpdateProfile() throws InterruptedException {

		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.goTo();
		LoginPage.LoginintoApplication("ram.user@cattechnologies.com", "123456789");
		Thread.sleep(2000);

		ProfilePage ProfilePage = new ProfilePage(driver);
		ProfilePage.goToProfilePage();
		Thread.sleep(2000);
		ProfilePage.UpdateProfile("123456789", "123456789");

	}

}
