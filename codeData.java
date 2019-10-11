package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.LoginPage;

public class codeData {
	
	//Local variable
	String menuId,subMenuId;
	
	//Getters and setters
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public void setSubMenuId(String subMenuId) {
		this.subMenuId = subMenuId;
	}
	public String getMenuId() {
		return menuId;
	}
	public String getSubMenuId() {
		return subMenuId;
	}

	//Navigate to functions
	public void setMenu(String menu) {
		if(menu.equals("Contract")) {
			this.setMenuId(contractId);	
		}
	}
	
	public void setSubMenu(String subMenu) {
		if(subMenu.equals("New Contract")) {
			this.setSubMenuId(newContractId);	
		}else if(subMenu.equals("Resume")) {
			this.setSubMenuId(resumeId);	
		}
	}
	
	public void setIdsforNavigateTo(String menu,String subMenu) {
		this.setMenu(menu);
		this.setSubMenu(subMenu);
	}
	
	
	public String createCode(String encodingIndex) {
		String codeText = setupSnipet;
		
		switch (encodingIndex) {
		case "1":
			codeText = codeText
			+"\r\n//Step 1. - Navigate to Menu"
			+ "\r\ndriver.findElement(By.id(\""+this.getMenuId()+"\")).click();"
			+"\r\ndriver.findElement(By.id(\""+this.getSubMenuId()+"\")).click();";
				
		default:
			break;
			
		}
		return codeText = codeText + "}}";
	}	
	
	
	//Ids
		String contractId = "MenuContract";
		String newContractId = "NewContract";
		String resumeId = "Resume";
		//Resume Page	
			//Frames
			String mainFrameId =  "mainFrame";
			//Inputs
			String contractNoId =  "txtContractNo";
			String resumeDateId =  "txtResumeDate";
			//Button
			String contractSearchButtonId =  "btnSearchContract";
			String addButtonId =  "btnAdd";
			String addAllButtonId =  "btnAddAll";
			String saveButtonId =  "btnSave";
			
			//Grids
			String unitsGridId =  "//table[@id='grdUnitsOnContract']/tbody/tr/td[2]";
	//Misc
		String nextLine = "\r\n";
	//Code snipets
		String packageSnipet = "package resources.data;"+nextLine;
		String classSnipet = "public class test{"+nextLine;
		String psvmSnipet = "public static void main(String args[]) {"+nextLine;
		String importSnipet = "import pages.*;"+
		nextLine+"import java.util.concurrent.TimeUnit;" + 
		nextLine+"import org.openqa.selenium.ie.InternetExplorerDriver;" + 
		nextLine+"import org.openqa.selenium.remote.CapabilityType;" + 
		nextLine+"import org.openqa.selenium.remote.DesiredCapabilities;"+
		nextLine+"import org.openqa.selenium.By;\r\n" + 
		nextLine+"import org.openqa.selenium.WebDriver;"+nextLine;
		
		String browserSetup = "//Browser set up"+
		nextLine+"System.setProperty(\"webdriver.ie.driver\",\"D:\\\\SMS8.1-2019\\\\test\\\\resources\\\\drivers\\\\\"+\"IEDriverServer2.4.exe\"); "+ 
		nextLine+"DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); " + 
		nextLine+"caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true); " + 
		nextLine+"caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);  " + 
		nextLine+"caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); " + 
		nextLine+"WebDriver driver = new InternetExplorerDriver(caps); " + 
		nextLine+"driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);";
		
		String windowHandles = "String mainWindowHandle = driver.getWindowHandle(); " + 
		nextLine+"String currentWindowHandle = mainWindowHandle; " + 
		nextLine+"String previousWindowHandle = null; "+nextLine;
		
		String loadURL = "driver.navigate().to(\"http://10.69.11.99/smsqc/Login.aspx?ContractEstimateId=\"); "+nextLine;
		String loginInSMS = "LoginPage loginPage = new LoginPage(driver); " + 
		nextLine+"loginPage.loginToSMS(\"administrator\", \"sms2219\", \"UAE QC\"); ";
		
		String setupSnipet = 
				packageSnipet+importSnipet+classSnipet+psvmSnipet+browserSetup+windowHandles+loadURL+loginInSMS;
				
	
}
