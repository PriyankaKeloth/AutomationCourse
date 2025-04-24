package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandlingDropdown extends Base {
	
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1= driver.findElement(By.id("dropdowm-menu-1"));
		Select select= new Select(dropdown1);
		//select.selectByIndex(2);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
	
	}
	public void verifyCheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox= driver.findElement(By.xpath("//label[text()='Option 2']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(checkbox));
    	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
    			.withTimeout(Duration.ofSeconds(10))
    			.pollingEvery(Duration.ofSeconds(3))
    			.ignoring(NoSuchElementException.class);
    			fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox));
    			boolean isCheckboxSelected=checkbox.isSelected();
    			Assert.assertFalse(isCheckboxSelected,"Checkbox is selected");
		checkbox.click();	
	}
	public void verifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton= driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton.click();
		boolean verify= radiobutton.isSelected();
		System.out.println(verify);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown dropdown= new HandlingDropdown();
		dropdown.initialiseBrowser();
		//dropdown.verifyDropdown();
	//	dropdown.verifyCheckbox();
		dropdown.verifyRadiobutton();
		//dropdown.driverCloseandQuit();
	}

}
