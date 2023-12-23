package pages;

import org.openqa.selenium.By;

public class Sudheer_EmpMgnt_CustSuprt  extends LandingPage_Admin
{	
	By EmpMgntsidemenu_ele = By.xpath("//span[contains(text(),'Employee Management')]");
	By AddCustSupportsubmodule = By.xpath("//span[contains(text(),'Add Customer Support')]");
	By ACSpcspersonnameTB = By.xpath("//input[@id='c_name']");
	By ACSpcsMobTB = By.xpath("//input[@id='c_mobile_no']");
	
	By ACSpSubmitbtn=By.xpath("//button[contains(text(),'Submit')]");
	By ACSpResetbtn=By.xpath("//button[contains(text(),'Reset')]");
	
	By ACSpTSearchTB=By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
	By ACSTPrevbtn=By.xpath("//li[@id='datatable_previous']");
	By ACSTnextbtn=By.xpath("//li[@id='datatable_next']"); 	
	
	By ACSTfilterDW =By.xpath("//select[@name='datatable_length']");
	

	public void opnEmpmgntMenu() 
	{
		delay(1);
		clickElement(EmpMgntsidemenu_ele);
	}

	public void clickAddCustSprtsubmodule()
	{
		delay(1);
		clickElement(AddCustSupportsubmodule);
	}
	
	public void fillcustsuprtpg()
	{
		enterText(ACSpcspersonnameTB, "CustSprtPerson1"); //cust support person name
		enterText(ACSpcsMobTB, "9999999991");  //custsupportmobileno
		delay(1);
		//clickElement(ACSpSubmitbtn);
		DoubleClickelement(ACSpSubmitbtn);
		System.out.println("Submit button should be clicked on AddCustSupport page");
	}
	

}