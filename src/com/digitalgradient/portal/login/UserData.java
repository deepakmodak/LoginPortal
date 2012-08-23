package com.digitalgradient.portal.login;

public class UserData {
	
    private String username;
    private String password;
    private String realName;
    private String location;
    public boolean valid;
	
	
    public String getRealName() {
       return realName;
	}
    public void setRealName(String newRealName) {
       realName = newRealName;
	}
	
    public String getLocation() {
       return location;
	}
    public void setLocation(String newLocation) {
       location = newLocation;
	}

    public String getPassword() {
       return password;
	}
    public void setPassword(String newPassword) {
       password = newPassword;
	}

    public String getUserName() {
       return username;
	}
    public void setUserName(String newUsername) {
       username = newUsername;
	}
			
    public boolean isValid() {
       return valid;
	}

    public void setValid(boolean newValid) {
       valid = newValid;
	}	
}