package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
   public void verifyTablehandling() {
	   driver.navigate().to("https://money.rediff.com/indices/nse");
	   WebElement showmore= driver.findElement(By.id("showMoreLess"));
	   showmore.click();
	   WebElement datatable=driver.findElement(By.id("dataTable"));
	   System.out.println(datatable.getText());
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.initialiseBrowser();
		table.verifyTablehandling();
	//	table.driverCloseandQuit();
	}

}
