package execution;

import org.testng.annotations.Test;

import pages.Sudheer_BookingMgnt;

public class Exe_BookingMgnt  extends Sudheer_BookingMgnt
{
	@Test(priority = 1,enabled=true)
	public  void opnbrowser() throws Throwable {
		
		driver=LaunchAdminurl();
		//this should launch the admin url
		System.out.println("Testtt  with Priority1 sucessfull");
	}
	
   @Test(priority = 2,enabled=true)
	public void Login() {
		//this should login into website
		LoginintoAdmin();
		System.out.println("Testtt  with Priority2 sucessfull");
	}
	
   @Test(priority = 3,enabled=true)
   public void dismispopup() {
	   delay(1);
	   Dismisspopupp();
	   System.out.println("Testtt  with Priority3 sucessfull");
   }
   
   @Test (priority = 4,enabled=true)
   public void exe_fillbookingmgntpg() {
	   opnbookingmgntpg();
	   fillbookingmgntpg();
	   System.out.println("Testtt  with Priority4 sucessfull");
   }
   
   
	
	
	
	
}
