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
public class Seats {

     String Seat;
     int availableseats;
     int reservedseats;

    public int getReservedseats() {
        return reservedseats;
    }

    public void setReservedseats(int reservedseats) {
        this.reservedseats = reservedseats;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }
     int Totalseats;
     int Availableseats;

    public int getTotalseats() {
        return Totalseats;
    }

    public void setTotalseats(int Totalseats) {
        this.Totalseats = Totalseats;
    }

    public int getAvailableseats() {
        return Availableseats;
    }

    public void setAvailableseats(int Availableseats) {
        this.Availableseats = Availableseats;
    }
     
    
}
