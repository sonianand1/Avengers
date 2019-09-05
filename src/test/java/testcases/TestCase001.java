package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Homepage;

public class TestCase001 extends Homepage {
	Homepage Homepage;
	public TestCase001()
	{
		super();
	}
	@BeforeTest
	public void launchApplication() throws IOException
	{
		startApp();
	}
@Test(priority=0)
public void scrollIntoView() throws IOException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	
}
}