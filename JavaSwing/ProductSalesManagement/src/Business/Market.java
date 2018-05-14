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
public class Market {

    private String marketName;
    private ArrayList<User> customerList;

    public Market() {
        customerList = new ArrayList<>();
    }

    public ArrayList<User> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<User> customerList) {
        this.customerList = customerList;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public User addCustomer() {
        User o = new User();
        customerList.add(o);
        return o;
    }

    public void removeProduct(User o) {
        customerList.remove(o);
    }
}
