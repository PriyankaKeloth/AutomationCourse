package testScript;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestngBase;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase {

	@Test(priority=1,description="verifying whether the user is able to successfully login with valid credentials")
	public void verifyUserLoginwithValidCredentials() throws IOException {
		String username=ExcelUtility.readStringData(0, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginbutton();
		boolean isProductDisplayed=login.productDisplayed();
		Assert.assertTrue(isProductDisplayed, "User was Unable to Login Successfully");
	}

	@Test(priority=2)
	public void verifyUserLOginwithInvalidUsername() throws IOException {
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginbutton();
		String actual=login.getPageLogo();
		String expected="SWAGLABS";
		Assert.assertEquals(actual, expected,"User was able to Login with Invalid Username");
	}

	@Test(priority=3)
	public void verifyUserLOginwithInvalidPassword() throws IOException {
		String username=ExcelUtility.readStringData(2, 0, "LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginbutton();
	}
	@Test(priority=4)
	public void verifyUserLoginwithInvalidCredentials() throws IOException {
		String username=ExcelUtility.readStringData(3, 0, "LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginbutton();
	}
}
