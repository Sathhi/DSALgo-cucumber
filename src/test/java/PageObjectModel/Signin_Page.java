package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	WebDriver driver;
	public Signin_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

@FindBy(xpath="//a[@href='/login']")
WebElement signinclick;

@FindBy(xpath="//input[@name='username']")
WebElement usernameEnter;

@FindBy(xpath="//input[@name='password']")
WebElement passwordEnter;

@FindBy(xpath="//input[@value='Login']")
WebElement loginClick;

@FindBy(xpath="//a[@href='/logout']")
WebElement logoutClick;

public WebElement signinclick()
{
	return signinclick;
}

public WebElement userNameEnter()
{
	return usernameEnter;
}
public WebElement passwordEnter()
{
	return passwordEnter;
}
public WebElement loginClick()
{
	return loginClick;
}
public WebElement logoutClick()
{
	return logoutClick;
}
}

