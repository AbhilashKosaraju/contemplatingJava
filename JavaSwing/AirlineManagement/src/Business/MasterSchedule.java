/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Abhilash Kosaraju
 */
public class MasterSchedule {
    
    CustomerDirectory dir= new CustomerDirectory();
    Airliners air = new Airliners();

    public CustomerDirectory getDir() {
        return dir;
    }

    public void setDir(CustomerDirectory dir) {
        this.dir = dir;
    }

    public Airliners getAir() {
        return air;
    }

    public void setAir(Airliners air) {
        this.air = air;
    }
    
    
}
