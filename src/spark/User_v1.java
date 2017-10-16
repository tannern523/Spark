/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

/**
 *
 * @author nxt5067
 */
public class User_v1 {
    
    private String username;
    private String password;
    
    public User_v1(String newUsername, String newPassword){
        username = newUsername;
        password = newPassword;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    public boolean authenticate(String theUsername, String thePassword){
        if(theUsername==username && thePassword==password){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
