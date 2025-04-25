package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {//construcor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")private WebElement usernamefield;
	@FindBy(id = "password")private WebElement passwordfield;
	@FindBy(id = "login-button")private WebElement loginbutton;
	@FindBy(xpath = "//div[text()='Products']")private WebElement products;
	@FindBy(xpath = "//div[@class='login_logo']")private WebElement pagelogo;
	

	public void enterUsernameOnUsernameField(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}

	public void clickOnLoginbutton() {
		loginbutton.click();
	}
	public boolean productDisplayed() {
		return products.isDisplayed();
	}
	public String getPageLogo() {
		return pagelogo.getText();
	}
}
