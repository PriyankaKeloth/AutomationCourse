package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyRightClick() {
		WebElement rightclick= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();  //for using rightclick
	}
    public void verifyMouseOver() {
    	WebElement mouseover= driver.findElement(By.xpath("//a[@id='progress-bars']"));
    	Actions action=new Actions(driver);
    	action.moveToElement(mouseover).build().perform();
    	
    }
    public void verifyDraganddrop() {
    	driver.navigate().to("https://demoqa.com/droppable");
    	WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
    	WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
    	Actions action=new Actions(driver);
    	action.dragAndDrop(drag,drop).build().perform();
    }
    public void verifyKeyboardaction() throws AWTException {
    	Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions=new HandlingActions();
		actions.initialiseBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseOver();
		//actions.verifyDraganddrop();
		try {
			actions.verifyKeyboardaction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//actions.driverCloseandQuit();

	}

}
