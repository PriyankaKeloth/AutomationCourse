package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void verifyfileuploadusingsendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile = driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys(
				"C:\\Users\\Ranil\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Selenium Note.pdf");
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitfile = driver.findElement(By.id("submitbutton"));
		submitfile.click();
	}

	public void verifyfileuplodingusingrobotclass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdfFile.click();
		StringSelection s = new StringSelection(
				"C:\\Users\\Ranil\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Selenium Note.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload file = new FileUpload();
		file.initialiseBrowser();
		// file.verifyfileuploadusingsendkeys();
		try {
			file.verifyfileuplodingusingrobotclass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// file.driverCloseandQuit();
	}

}
