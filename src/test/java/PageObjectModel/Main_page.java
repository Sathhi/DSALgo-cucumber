package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_page {
	 WebDriver driver;
	public  Main_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
   @FindBy(xpath="//button[contains(text(),'Get Started')]")
   WebElement getstartedoption;
   
   public WebElement getstartedoption()
   {
	   return getstartedoption;
   }
}

