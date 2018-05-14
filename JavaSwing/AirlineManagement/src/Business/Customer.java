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
public class Customer {

    String Name;
    String Gender;
    String Passportnumber;
    String flightserial;
    String searial;

    Seats s = new Seats();

    public String getSearial() {
        return searial;
    }

    public void setSearial(String searial) {
        this.searial = searial;
    }

    public Seats getS() {
        return s;
    }

    public void setS(Seats s) {
        this.s = s;
    }

    public String getFlightserial() {
        return flightserial;
    }

    public void setFlightserial(String flightserial) {
        this.flightserial = flightserial;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPassportnumber() {
        return Passportnumber;
    }

    public void setPassportnumber(String Passportnumber) {
        this.Passportnumber = Passportnumber;
    }

}
