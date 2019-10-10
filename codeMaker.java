package scripts;

public class codeMaker {
	
	public String coder(String[] encodedStep) {
		
		String encodingIndex = encodedStep[0];
		codeData codeDt = new codeData();
		
		switch (encodingIndex) {
		case "1":
			String menu = encodedStep[1];
			String subMenu = encodedStep[2];
			System.out.println(menu);
			System.out.println(subMenu);
			codeDt.setIdsforNavigateTo(menu, subMenu);
			return codeDt.createCode(encodingIndex);
		default:
			break;
		}
		return null;
	}
	
}
