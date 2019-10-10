package scripts;

public class codeData {
	
	//Local variable
	String menuId,subMenuId;
	
	//Ids
	String contractId = "Contract";
	String newContractId = "New Contract";
	
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
		}
	}
	
	public void setIdsforNavigateTo(String menu,String subMenu) {
		this.setMenu(menu);
		this.setSubMenu(subMenu);
	}
	
	
	public String createCode(String encodingIndex) {
		String codeText;
		switch (encodingIndex) {
		case "1":
			return codeText = "Click on "+this.getMenuId()+"\nClick on "+this.getSubMenuId();
		default:
			return null;
		}
	}
		
	
}
