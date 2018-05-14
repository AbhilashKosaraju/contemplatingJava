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
public class Customer {

    String Name;
    String Gender;
    String Passportnumber;
    int flightserial;
    String Startpoint;
    String Destination;
    String Seat;
    String Airlines;

    public String getAirlines() {
        return Airlines;
    }

    public void setAirlines(String Airlines) {
        this.Airlines = Airlines;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    Seat S = new Seat();

    public String getStartpoint() {
        return Startpoint;
    }

    public void setStartpoint(String Startpoint) {
        this.Startpoint = Startpoint;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public Seat getS() {
        return S;
    }

    public void setS(Seat S) {
        this.S = S;
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

    public int getFlightserial() {
        return flightserial;
    }

    public void setFlightserial(int flightserial) {
        this.flightserial = flightserial;
    }

    @Override
    public String toString() {

        return this.Name;

    }
}
