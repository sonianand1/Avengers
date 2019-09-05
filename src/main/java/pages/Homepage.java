package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Homepage extends Base{
	@FindBy(xpath="(//div[@class='col-lg-4 col-md-2'])[1]")
	public WebElement accounts;
	@FindBy(xpath="(//div[@class='col-lg-4 col-md-2'])[2]")
	public WebElement aboutall;
	@FindBy(xpath="(//div[@class='col-lg-4 col-md-2'])[3]")
	public WebElement help;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	

}
