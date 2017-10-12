/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;
import java.util.*;

/**
 *
 * @author nxt5067
 */
public class UserList {
    private List<User> userList = new ArrayList<User>();
    
    public UserList(){
        User user1 = new User("user1", "password1");
        userList.add(user1);
        User user2 = new User("user2", "password2");
        userList.add(user2);
        User user3 = new User("user3", "password3");
        userList.add(user3);
    }    
    
    public void addUser(User aUser){
        userList.add(aUser);
    }
}
