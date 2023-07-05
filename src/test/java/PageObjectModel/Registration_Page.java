package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	WebDriver driver;
	public Registration_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/register']")
	WebElement registerClick;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Registerusername;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerlink;
	
	@FindBy(xpath="//input[@name='password1']")
	WebElement passwordenter;
	
	@FindBy(xpath="//input[@name='password2']")
	WebElement passwordenter2;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement registertologin;
	
	public WebElement registerClick()
	{
		return registerClick;
	}
	public WebElement  Registerusername()
	{
		return  Registerusername;
	}
	public WebElement registerlink()
	{
		return registerlink;
	}
	public WebElement passwordenter()
	{
		return passwordenter;
	}
	public WebElement  passwordenter2()
	{
		return  passwordenter2;
		
	}
	public WebElement registertologin()
	{
		return registertologin;
	}

}


