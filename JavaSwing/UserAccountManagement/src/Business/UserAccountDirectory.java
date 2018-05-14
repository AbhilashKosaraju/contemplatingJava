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
public class UserAccountDirectory {

    private ArrayList<UserAccounts> userDirectory;

    public UserAccountDirectory() {
        userDirectory = new ArrayList<UserAccounts>();
    }

    public UserAccounts addUserAccounts() {
        UserAccounts u = new UserAccounts();
        userDirectory.add(u);
        return u;
    }

    public void deleteUserAccounts(UserAccounts ua) {
        System.out.println("INSIDE THE DELETE");

        userDirectory.remove(ua);
    }

    public UserAccounts searchUserAccounts(String uname) {

        System.out.println("INSIDE THE DELETE");
        for (UserAccounts u : userDirectory) {
            if (u.getUserId().toLowerCase().equals(uname)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<UserAccounts> getUserDirectory() {
        return userDirectory;
    }

}
