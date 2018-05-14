/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Business;
import Business.Person;
import Business.PersonDirectory;
import Business.UserAccounts;
import Business.UserAccountDirectory;

public class ConfigureABusiness {

    public static Business Initialise(String s) {
        Business b = new Business(s);

        PersonDirectory pd = b.getPersonDirectory();

        Person p = pd.addPerson();
        p.setFirstName("Abhilash");
        p.setLastName("Kosaraju");
        p.setUserName("abhi");
        p.setGender("Male");
        p.setPassword("password");

        Person pp = pd.addPerson();
        pp.setFirstName("Charmila");
        pp.setLastName("Kosaraju");
        pp.setUserName("charu");
        pp.setGender("Female");
        pp.setPassword("pwd");

        Person qq = pd.addPerson();
        qq.setFirstName("Sandeep");
        qq.setLastName("Kilaru");
        qq.setUserName("Sandeep");
        qq.setGender("Male");
        qq.setPassword("passed");

        Person q = pd.addPerson();
        q.setFirstName("Sowjanya");
        q.setLastName("Kilaru");
        q.setUserName("sowji");
        q.setGender("Female");
        q.setPassword("pass");

        return b;
    }

}
