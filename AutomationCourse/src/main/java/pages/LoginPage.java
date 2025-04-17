package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement usernamefield;
	@FindBy(id = "password")
	private WebElement passwordfield;
	@FindBy(id = "login-button")
	private WebElement loginbutton;

	public void enterUsernameOnUsernameField() {
		usernamefield.sendKeys("standard_user");
	}

	public void enterPasswordOnPasswordField() {
		passwordfield.sendKeys();
	}

	public void clickOnLoginbutton() {
		loginbutton.click();
	}
}
