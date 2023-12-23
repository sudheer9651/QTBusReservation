package pages;

import org.openqa.selenium.By;

public class ST_LocMgnt extends LandingPage_Admin {
	

	 By LocMgntsidemenu = By.xpath("//span[contains(text(),'Location Management')]");
	 By AddStatemodule = By.xpath("//span[contains(text(),'Add State')]");
	 By AddCitymodule = By.xpath("//span[contains(text(),'Add City')]");
	 By AddLocationmodule = By.xpath("//span[contains(text(),'Add Location')]");
	 By AddstateTB =By.xpath("//input[@id='state']"); 
	 By Submitbtn= By.xpath("(//button[contains(text(),'Submit')])[last()]");
	By  Resetbtn =By.xpath("(//button[contains(text(),'Reset')])[last()]");
	By  LocMgntbreadcrum =By.xpath("//a[contains(text(),'Location Management')]");
	By AddcityTB =By.xpath("//input[@id='city']");
	By AddLocCityDW =By.xpath("//select[@id='city']");
	By AddLocpTB  =By.xpath("//input[@id='location']");
	By SelectStateDW  =By.xpath("//select[@id='state']");	
	By SelectCityDW  =By.xpath("//select[@id='city']");
	By  AddLocpgLocationTB =By.xpath("//input[@id='location']");
	
	public void opnLocmgntpage() {
		highlight_By(LocMgntsidemenu);
		delay(1);
		clickElement(LocMgntsidemenu);
		delay(1);
	}
	
	public void opnAddStatepg() {
		highlight_By(AddStatemodule);
		delay(1);
		clickElement(AddStatemodule);
		delay(1);
	}
	
	public void fillAddStatepg(String statename) {
		highlight_By(AddstateTB);
		delay(1);
		enterText(AddstateTB, statename);
		clickElement(Submitbtn);
	}

	 public void navigatetoLocmgntpgbreadcrum() {
		 highlight_By(LocMgntbreadcrum);
		 delay(1);
		 clickElement(LocMgntbreadcrum);
	 }
	 
	 public void fillAddcitypg (int indexno, String cityname) {
		 highlight_By(AddCitymodule);
		 delay(1);
		 clickElement(AddCitymodule);
		 highlight_By(SelectStateDW);
		 delay(1);
		 dropDownSelectIndex(SelectStateDW, indexno);
		 highlight_By(AddcityTB);
		 delay(1);
		 enterText(AddcityTB, cityname);
		 highlight_By(Submitbtn);
		 delay(1);
		 clickElement(Submitbtn);
		 delay(2);
		 clickElement(LocMgntbreadcrum);
	 }
	 
	 public void opnADDLOCpg() {
		// highlight_By(LocMgntbreadcrum);
		 delay(1);
		 highlight_By(AddLocationmodule);
		 delay(1);
		 clickElement(AddLocationmodule);
		 
	 }
	 
	 public void fillADDLOCpg(int stateindexno, int cityindexno,String locname) {
		 highlight_By(SelectStateDW);
		 delay(1);
		 dropDownSelectIndex(SelectStateDW,stateindexno);
		 highlight_By(SelectCityDW);
		 delay(1);
		 dropDownSelectIndex(SelectCityDW, cityindexno);
		 highlight_By(AddLocpgLocationTB);
		 delay(1);
		 enterText(AddLocpgLocationTB,locname);
		 highlight_By(Submitbtn);
		 delay(1);
		 clickElement(Submitbtn);
		 
	 }
	 
	 
	 
}
