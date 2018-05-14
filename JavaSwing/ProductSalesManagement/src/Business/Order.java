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
public class Order {

    private List<OrderItem> orderItemList;
    private int orderNum;
    private static int count = 0;

    public Order() {
        count++;
        this.orderNum = count;
        this.orderItemList = new ArrayList<>();
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public OrderItem addOrderItem(Product p, int q, double price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }

    public void removeProduct(OrderItem o) {
        orderItemList.remove(o);
    }

}
