package com.base;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Base implements BaseInterface {
		public WebDriver driver;
		public WebDriverWait wait;
		public void startApp() throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\User1\\eclipse-workspace\\Hackathon_ING\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fis);
			 String browser = prop.getProperty("Browser");
			String url=prop.getProperty("URL");
			if (browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if (browser.equalsIgnoreCase("Firefox"))
			{
				//code for setting path for gecko driver
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				//code for IE browser
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" launched successfully");
			
			
		}
		public void type(WebElement ele, String data) {		
			ele.sendKeys(data);
			System.out.println("The data "+data+" is Entered Successfully");		
	}

		public void clickWithNoSnap(WebElement ele) {
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");		
	}

		public void takeScreenshot() throws IOException
		{
			File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			File des=new File("./snaps/img.png");
			FileUtils.copyFile(src, des);
		}
		public String getText(WebElement ele) 
		{
			String text = ele.getText();
			return text;
		}
		
		public void closeBrowser() {
			driver.close();
		}
		public void closeAllBrowsers()
		{
			driver.quit();
		}

	}


