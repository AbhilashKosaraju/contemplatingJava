/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AbhilashKosaraju
 */
public class MasterOrderCatalog {

    private List<Order> orderCatalog;

    public MasterOrderCatalog() {
        orderCatalog = new ArrayList<>();
    }

    public List<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(List<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

    public Order addOrder() {
        Order o = new Order();
        orderCatalog.add(o);
        return o;
    }

    public void removeProduct(Order o) {
        orderCatalog.remove(o);
    }
}
