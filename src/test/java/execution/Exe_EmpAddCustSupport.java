package execution;

import org.testng.annotations.Test;

import pages.Sudheer_EmpMgnt_CustSuprt;

public class Exe_EmpAddCustSupport extends Sudheer_EmpMgnt_CustSuprt /*Exe_Emp_MgntBDriver*/ 

{

	@Test(priority = 1,enabled=true)
	public  void opnbrowser() throws Throwable {
		
		driver=LaunchAdminurl();
		//this should launch the admin url
		System.out.println("Admin url should be launched");
	}
	
   @Test(priority = 2,enabled=true)
	public void Login() {
		//this should login into website
		LoginintoAdmin();
		System.out.println("-------Logged in successfully into website------");
	}
   
   @Test(priority = 3,enabled=true)
   public void dismispopup() {
	   delay(1);
	   Dismisspopupp();
	   System.out.println("popup goneee");
   }
   
   
   @Test(priority = 4)
	public void clickAddCustSupport() {
	   opnEmpmgntMenu(); // this will click on Employee Management side menu
	   delay(1);
	   clickAddCustSprtsubmodule();
	   System.out.println("Testtt  with Priority3 sucessfull");
   }

   @Test(priority = 5) 
   public void fillcustsupportpg()
   {
	   fillcustsuprtpg();
   }
	

   @Test(priority = 7)
	public void closebroswer() {
		System.out.println("Closingg the browserr");
//	   driver.quit();
	}

	
	
	
	
}
