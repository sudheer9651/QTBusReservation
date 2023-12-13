package pages;


import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import base.LaunchBrowser_Userurl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage_User extends LaunchBrowser_Userurl

{

	public WebDriver LaunchUserurl() throws Exception
	{
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\ResourcesSpreadsheets\\config.properties");
		obj.load(fis);
		String BrowserName = obj.getProperty("browser");
		String URL = obj.getProperty("User_url");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();					
		}
		else if (BrowserName.equalsIgnoreCase("Firefox"))
		{
			 WebDriverManager.firefoxdriver();
			 driver=new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		
		return driver; 		
	}



public static void main(String[] args) 
{
	LandingPage_User admurlobj = new LandingPage_User();
try {
		admurlobj.LaunchUserurl();
    } 
catch (Exception e) 
	{
		e.printStackTrace();
	}
}

	
	
}
