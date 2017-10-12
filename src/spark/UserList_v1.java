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
public class UserList_v1 {
    
    private List<User_v1> userList = new ArrayList<User_v1>();
    
    public UserList_v1(User_v1 newUser){
        userList.add(newUser);
    }

    /**
     * @return the userList
     */
    public List<User_v1> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(List<User_v1> userList) {
        this.userList = userList;
    }
    
}
