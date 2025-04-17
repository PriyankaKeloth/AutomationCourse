package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestngBase;

public class LoginTest extends TestngBase {

	@Test
	public void verifyUserLoginwithValidCredentials() {
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField();
		login.enterPasswordOnPasswordField();
		login.clickOnLoginbutton();
	}

	@Test
	public void verifyUserLOginwithInvalidUsername() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}

	@Test
	public void verifyUserLOginwithInvalidPassword() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	@Test
	public void verifyUserLoginwithInvalidCredentials() {
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
}
