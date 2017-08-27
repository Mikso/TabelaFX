/**
 * 
 */
package com.implementado;

/**
 * @author Bruno
 *
 */
public class UsuarioImp {

	private Long id;
	private String userName;
	private String userEmail;
	private String firstName;
	private String lastName;
	private boolean activeCol;
	
	
	
	
	
	public UsuarioImp(Long id, String userName, String userEmail, String firstName,
			String lastName, boolean activeCol){
		
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.activeCol = activeCol ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActiveCol() {
		return activeCol;
	}

	public void setActiveCol(boolean activeCol) {
		this.activeCol = activeCol;
	}



	
}
