/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AbhilashKosaraju
 */
public class UserDirectory {

    private ArrayList<User> userDirectory;

    public UserDirectory() {
        userDirectory = new ArrayList<User>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public User addUser() {
        User user = new User();
        userDirectory.add(user);
        return user;
    }
}
