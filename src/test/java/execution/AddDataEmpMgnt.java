package execution;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddDataEmpMgnt {
	
	@BeforeClass
	public void getreqstringdata() throws Exception
	{	
	String empdatpath=".\\src\\main\\resources\\ResourcesSpreadsheets\\addEmpdata.properties";
	Properties obj = new Properties();
	FileInputStream fis = new FileInputStream(empdatpath);	
	obj.load(fis);
	
	String aBDpBuscategoryDD = obj.getProperty("aBDpBuscategoryDD");
	String aBDpFullName = obj.getProperty("aBDpFullName");
	String aBDpDriverWtspNum = obj.getProperty("aBDpDriverWtspNum");
	String aBDpEmailid = obj.getProperty("aBDpEmailid");
	String aBDpAltMobnumb = obj.getProperty("aBDpAltMobnumb");
	String aBDpDlicenceid = obj.getProperty("aBDpDlicenceid");
	String aBDpDLImagepath = obj.getProperty("aBDpDLImagepath");
	String aBDpAadharnum = obj.getProperty("aBDpAadharnum");
	String aBDpAddharimgpath = obj.getProperty("aBDpAddharimgpath");
	String aBDpTotExp = obj.getProperty("aBDpTotExp");
	String aBDpAddress = obj.getProperty("aBDpAddress");
	
	String BranchOperatorFullName = obj.getProperty("BranchOperatorFullName");
	String BranchOperatorWtspnumb = obj.getProperty("BranchOperatorWtspnumb");
	String BranchOoperatorEmailid = obj.getProperty("BranchOoperatorEmailid");
	String BranchOperatorAltnumb = obj.getProperty("BranchOperatorAltnumb");
	String BranchOperatorAadharnum = obj.getProperty("BranchOperatorAadharnum");
	String BranchOperatorAadharpath = obj.getProperty("BranchOperatorAadharpath");
	String BranchOperatorAddress = obj.getProperty("BranchOperatorAddress");

	String CustsprtName = obj.getProperty("CustsprtName");
	String Custsprtmobile = obj.getProperty("Custsprtmobile");
	
	
	

			
	}
	
	
}
