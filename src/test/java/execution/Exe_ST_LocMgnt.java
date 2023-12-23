package execution;

import org.testng.annotations.Test;

import pages.ST_LocMgnt;

public class Exe_ST_LocMgnt  extends ST_LocMgnt{

	@Test(priority = 1)
	public void OpnBroswerLogintoAdmin() throws Exception {
		
		driver=LaunchAdminurl();
		LoginintoAdmin();
		Dismisspopupp();
	}
	
	@Test(priority = 2)
	public void opnLocMgntpg() {
		opnLocmgntpage();
	}
	
	@Test(priority = 3)
	public void fillStatedata() {
		opnAddStatepg();
		fillAddStatepg("Maharastra");
		navigatetoLocmgntpgbreadcrum();
	}
	
	@Test(priority = 4)
	public void fillCitydatapg() {
		fillAddcitypg(1,"Mumbai");
	}
	
	@Test(priority = 5)
	public void fillLocationdata() {
		opnADDLOCpg();
		fillADDLOCpg(1,1,"ShivajiTerminal");
		delay(5);
		System.out.println("closing Browser");
		driver.quit();
	}
	
	
	
	
	
	
}
