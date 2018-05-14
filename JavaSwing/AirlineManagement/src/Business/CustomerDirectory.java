/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Abhilash Kosaraju
 */
public class CustomerDirectory {

    private static ArrayList<Customer> Directory;

    public CustomerDirectory() {
        Directory = new ArrayList<Customer>();
    }

    public static Customer addCustomers() {
        Customer cus = new Customer();
        Directory.add(cus);
        return cus;
    }

    public ArrayList<Customer> getDirectory() {
        return Directory;
    }

    public void setDirectory(ArrayList<Customer> Directory) {
        this.Directory = Directory;
    }

}
