package scripts;

public class testStepAnalyzer {
	public String[] encodeStep(String testStep) {
		String menu,subMenu;
		
		if(testStep.contains("Navigate")) {
			testStep = testStep.replace("Navigate to ","");
			menu = testStep.substring(0, testStep.indexOf(" >"));
			subMenu = testStep.substring(testStep.indexOf("> ")+2);
			String key[] = {"1",menu,subMenu};
			return key; 
		}
		
		return null;
	}
	
}
