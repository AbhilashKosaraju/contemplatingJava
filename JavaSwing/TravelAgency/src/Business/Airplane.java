/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author AbhilashKosaraju
 */
public class Airplane {

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }
    
     private String Model;
     private int totalseats;
     private int manYear;

    public int getManYear() {
        return manYear;
    }

    public void setManYear(int manYear) {
        this.manYear = manYear;
    }
    
}
