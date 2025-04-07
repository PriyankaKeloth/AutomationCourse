package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebelementCommands extends Base {
	
    public void verifyWebelementCommands(){
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	WebElement messagebox= driver.findElement(By.id("single-input-field"));
    	messagebox.sendKeys("Welcome");
    	WebElement showmessagebutton= driver.findElement(By.id("button-one"));
    	showmessagebutton.click();
    	WebElement yourmessage= driver.findElement(By.id("message-one"));
    	System.out.println(yourmessage.getText());
    	messagebox.clear();
    	String bordercolourofshowmessage= showmessagebutton.getCssValue("border-color");
    	System.out.println(bordercolourofshowmessage);
    	//System.out.println(showmessagebutton.isDisplayed());
    	System.out.println(showmessagebutton.isEnabled());
    	
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebelementCommands Webelement= new WebelementCommands();
		Webelement.initialiseBrowser();
		Webelement.verifyWebelementCommands();
		//Webelement.driverCloseandQuit();
		
	}

}
