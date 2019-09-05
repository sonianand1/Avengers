package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.base.Base;

public class FirstTest extends Base  {
	@Test
	public void launchApplication() throws IOException
	{
	
		startApp();
		
				
	
	}
}


