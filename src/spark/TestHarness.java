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
public class TestHarness {
    
    public TestHarness(){
    
        // This tests the User class.
        User_v1 testUser = new User_v1("username", "password");
        if(testUser != null){
            System.out.println("User constructor works!");
        }
        else{
            System.out.println("User constructor failed!");
        }
        
        String testUsername = testUser.getUsername();
        if(testUsername.equals("username")){
            System.out.println("Test username accessor works!");
        }
        else{
            System.out.println("Test username accessor failed!");
        }
        
        // This tests the UserList class.
        UserList_v1 testUserList = new UserList_v1(testUser);
        if(testUserList != null){
            System.out.println("UserList constructor works!");
            System.out.println();
        }
        else{
            System.out.println("UserList constructor failed!");
        }
        
        
    
    }
    
}
