/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author nxt5067
 */
public class LoginCntl {
    
    UserList userList = new UserList();
    
    LoginView aLoginView = new LoginView();
    
    public LoginCntl(){
        aLoginView.setVisible(true);
    }
    
    public void authenticate(String username, String password){
        User testUser = new User(username, password);
        boolean test = userList.containsUser(testUser);
        System.out.println(test);
        
    }
}
