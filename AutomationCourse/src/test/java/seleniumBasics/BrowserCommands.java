package seleniumBasics;

public class BrowserCommands extends Base {
	public void verifyBrowserCommands()
	{
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		String source= driver.getPageSource();
		System.out.println(source);
	}
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		BrowserCommands browser=new BrowserCommands();
		browser.initialiseBrowser();
		browser.verifyBrowserCommands();
		//browser.verifyNavigationCommands();
       // browser.driverCloseandQuit();
	}

}
