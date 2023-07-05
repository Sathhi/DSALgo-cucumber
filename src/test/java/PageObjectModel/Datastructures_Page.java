package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datastructures_Page {
	WebDriver driver;
	public Datastructures_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement Datastructureenter;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	WebElement timecomplexityclick;
	
	@FindBy(xpath="//a[@href='/data-structrures-introduction/practice']")
	WebElement datastrucurepractice;
	
	public WebElement Datastructureenter()
	{
		return Datastructureenter;
	}
	public WebElement timecomplexityclick()
	{
		return timecomplexityclick;
	}
	public WebElement datastrucurepractice()
	{
		return datastrucurepractice;
	}

}
