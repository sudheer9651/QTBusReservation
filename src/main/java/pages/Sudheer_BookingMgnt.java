package pages;

import org.openqa.selenium.By;

public class Sudheer_BookingMgnt extends LandingPage_Admin 
{
	By BookingMgntmenu = By.xpath("//span[contains(text(),'Booking Management')]");
	By BMpbusservicenoDW=By.xpath("//select[@id='k_service_no']");
	By BMpbusregnoDW=By.xpath("//select[@id='k_reg_no']");
	By BMpbustypeDW=By.xpath("//select[@id='k_bus_type']");
	By BMpFROMDW=By.xpath("//select[@id='k_from']");
	By BMpTOdw=By.xpath("//select[@id='k_to']");
	By BMpStartdatetime=By.xpath("//input[@id='k_start_time']");
	By BMpEnddatetime=By.xpath("//input[@id='k_end_time']");
	By BMpBoardingpointDW=By.xpath("//select[@id='k_boarding_point']");
	By BMpDropingpointDW=By.xpath("//select[@id='k_dropping_point']");
	By BMpdateJourney=By.xpath("//input[@id='k_doj']");
	By BMpSubmitbtn=By.xpath("//button[contains(text(),'Submit')]");
	By BMpRestbtn=By.xpath("//button[contains(text(),'Reset')]");
	By BMpTrevbtn =By.xpath("//li[@id='datatable_previous']");
	By BMpTnextbtn =By.xpath("//li[@id='datatable_next']");
	By BMpTfilterDW =By.xpath("//select[@name='datatable_length']");
	By BMpTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
	public void opnbookingmgntpg() {
		delay(0.5);
		clickElement(BookingMgntmenu);
		delay(0.5);
	}
	public void fillbookingmgntpg()
	{
		    //sendKeys("171200202303201");
		   //171200202303201  17 is date 12 is month'MM' 002023 is year 6 digits for year '00YYYY' 03 is hrs 20 is mins 1=>is Am 2=>Pm
		dropDownSelectIndex(BMpbusservicenoDW, 1); //bus service numb
		dropDownSelectIndex(BMpbusregnoDW, 1);//bus reg numb
		dropDownSelectIndex(BMpbustypeDW, 1); //bus type
		dropDownSelectIndex(BMpFROMDW, 1); //from dropdown
		dropDownSelectIndex(BMpTOdw, 1); // TO dropdown
		enterText(BMpStartdatetime, "171200202306002"); //start date time
		enterText(BMpEnddatetime, "181200202307002");    //end date Time
		dropDownSelectIndex(BMpBoardingpointDW, 1);     //boarding points DW
		dropDownSelectIndex(BMpDropingpointDW, 1);		//droppping points
		enterText(BMpdateJourney, "171200202309002");			//date of journey
		delay(0.3);
		highlight_By(BMpSubmitbtn);
		delay(0.5);
		clickElement(BMpSubmitbtn);		// submit button
	}
	
	
	
	
	
	

}
