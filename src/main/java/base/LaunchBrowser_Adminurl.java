package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericMethods.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser_Adminurl extends GenericMethods
{
	/**This method purpose is to browser is opened maximised and url is lunched*/		
	public WebDriver LaunchUrl() throws Exception
	{
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\ResourcesSpreadsheets\\config.properties");
		obj.load(fis);
		String BrowserName = obj.getProperty("browser");
		String URL = obj.getProperty("Admin_url");
		
				if(BrowserName.equalsIgnoreCase("chrome"))
					{
						WebDriverManager.chromedriver();
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
				

				
				
				
		driver.manage().window().maximize();
		driver.get(URL);
		
		return driver; 
	}
	
	//main  will enable to test this code LaunchBrowser with specific url 
	/*
	 
	public static void main(String[] args) {
		
		LaunchBrowser lb = new LaunchBrowser();
		try {
			lb.LaunchUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//LaunchUrl();
	}
	*/
	
}
