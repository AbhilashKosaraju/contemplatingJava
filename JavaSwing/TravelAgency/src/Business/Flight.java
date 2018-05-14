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
public class Flight {

    private String startpoint;
    private String destination;
    private int availableseats;
    private int reservedseats;
    private int SerialNumber;
    private String arrivetime;
    private String departtime;

    Seat se = new Seat();

    public Seat getSe() {
        return se;
    }

    public void setSe(Seat se) {
        this.se = se;
    }

    public String getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime;
    }

    public String getDeparttime() {
        return departtime;
    }

    public void setDeparttime(String departtime) {
        this.departtime = departtime;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public int getAvailableseats() {
        return availableseats;
    }

    public void setAvailableseats(int availableseats) {
        this.availableseats = availableseats;
    }

    public int getReservedseats() {
        return reservedseats;
    }

    public void setReservedseats(int reservedseats) {
        this.reservedseats = reservedseats;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
