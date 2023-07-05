package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array_Page {
	WebDriver driver;

	public Array_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='array']")
	WebElement Arrayclick;

	@FindBy(xpath="//a[@href='arrays-in-python']")
	WebElement arrayinpython;

	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryeditor;


	@FindBy(xpath="//a[@href='/array/arrays-using-list/']")
	WebElement Arraylistclick;

	@FindBy(xpath="//a[@href='/array/basic-operations-in-lists/']")
	WebElement Arrayoplist;

	@FindBy(xpath="//a[@href='/array/applications-of-array/']")
	WebElement Arrayapp;

	@FindBy(xpath="//a[@href='/array/practice']")
	WebElement Arraypractice;

	@FindBy(xpath="//a[@href='/question/1']")
	WebElement Arraysearchclick;

	@FindBy(xpath="//input[@type='submit']")
	WebElement submitclick;

	@FindBy(xpath="//a[@href='/question/2']")
	WebElement Arrayconsecutive;

	@FindBy(xpath="//a[@href='/question/3']")
	WebElement Arrayfind;

	@FindBy(xpath="//a[@href='/question/4']")
	WebElement Arraysorted;

	public WebElement Arrayclick()
	{
		return Arrayclick;
	}
	public WebElement arrayinpython()
	{
		return arrayinpython;
	}
	public WebElement tryeditor()
	{
		return tryeditor;
	}
	public WebElement Arraylistclick()
	{
		return Arraylistclick;
	}
	public WebElement Arrayoplist()
	{
		return Arrayoplist;
	}
	public WebElement Arrayapp()
	{
		return Arrayapp;
	}
	public WebElement Arraypractice()
	{
		return Arraypractice;
	}
	public WebElement Arraysearchclick()
	{
		return Arraysearchclick;
	}
	public WebElement submitclick()
	{
		return submitclick;
	}
	public WebElement Arrayconsecutive()
	{
	  return Arrayconsecutive;
	}
	public WebElement Arrayfind()
	{
		return Arrayfind;
	}
	public WebElement Arraysorted()
	{
		return Arraysorted;
	}
	}

