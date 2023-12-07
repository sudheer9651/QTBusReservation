package genericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods 
{
	//
	public static WebDriver driver;
	
	
	//delay method can be used instead of Thread.sleep
	public void delay(int timesec) 
		{
			long start = System.currentTimeMillis();
			long end = start + timesec * 1000;
			while (System.currentTimeMillis() < end)
			{ 
			}	
		}

	
	
	public boolean clickElement(By elementLocator)
		{
			WebElement ele=driver.findElement(elementLocator);
			if(ele.isDisplayed() & ele.isEnabled())
			{
					try
					{
						ele.click();
						return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						return false;	
					}	
			}
			else
			{
				return false;
			}
			
		}
	

	
	
}// closing bracket
