package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleAlert extends Base {

	public void verifyAlerthandling() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick=driver.findElement(By.id("alertButton"));
		simpleclick.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	public void verifyConfirmalert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	public void verifyPromptalert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Priyanka");
	    alert.accept();	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleAlert alert=new HandleAlert();
		alert.initialiseBrowser();
		//alert.verifyAlerthandling();
		//alert.verifyConfirmalert();
		alert.verifyPromptalert();
		//alert.driverCloseandQuit();
		
	}

}
