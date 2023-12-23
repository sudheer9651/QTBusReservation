package execution;

import org.testng.annotations.Test;

import pages.Sudheer_EmpMgnt_BrnOperator;

public class Exe_EmpMgntBOperator extends Sudheer_EmpMgnt_BrnOperator 
{
	@Test(priority = 1)
	public  void opnbrowser() throws Throwable {
		
		driver=LaunchAdminurl();
		//this should launch the admin url
	}
	
   @Test(priority = 2)
	public void Login() {
		//this should login into website
		LoginintoAdmin();
		System.out.println("-------Logged in successfully into website------");
	
	}
   
   @Test(priority = 3,enabled=true)
   public void dismispopup() {
	   delay(1);
	   Dismisspopupp();
	   
   }
   
   
   @Test(priority = 4)
	public void clickAddBranchOperator() {
	   opnEmpmgntMenu();
	   delay(2);
	   clickAddBranchoperatortab();

   }
 
   @Test(priority = 5)
   public void FillBrnOperatorpg()
   {
	   fillABranchoperatorPg();
	   delay(2);
	   searchdriversdata("9888888888");
	   delay(2);
   }
	
	
   
   
   @Test(priority = 6)
	public void closebroswer() {
	   
		System.out.println("Closingg the browserr");
		delay(5);
		driver.quit();
	}

	
}
