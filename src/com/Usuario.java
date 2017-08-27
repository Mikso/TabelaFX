/**
 * 
 */
package com;

/**
 * @author Bruno
 *
 */
public class Usuario {

	
	private String userName;
	private boolean activeCol;
	
	public Usuario(String userName, boolean activeCol){
		this.userName = userName;
		this.setActiveCol(activeCol);
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isActiveCol() {
		return activeCol;
	}

	public void setActiveCol(boolean activeCol) {
		this.activeCol = activeCol;
	}


	
}
