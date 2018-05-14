package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbhilashKosaraju
 */
public class AirLiner {
   
    private String Name;   
    private String License;
    private String Availablity;

    public String getAvailablity() {
        return Availablity;
    }

    public void setAvailablity(String Availablity) {
        this.Availablity = Availablity;
    }
    
    Flight f = new Flight();
    Airplane ap = new Airplane();

    public Airplane getAp() {
        return ap;
    }

    public void setAp(Airplane ap) {
        this.ap = ap;
    }
           
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String License) {
        this.License = License;
    }


    public Flight getF() {
        return f;
    }

    public void setF(Flight f) {
        this.f = f;
    }
 
     @Override
    public String toString(){
    
        return this.Name;
    }



}
