package com.base;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public interface BaseInterface {
		
		public void startApp() throws IOException;
		public void takeScreenshot() throws IOException;
		public void type(WebElement ele, String data);
		public void clickWithNoSnap(WebElement ele);
		public String getText(WebElement ele);
		public void closeBrowser();
		public void closeAllBrowsers();

}
