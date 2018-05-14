/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sowjanya
 */
public class AirPlanes {
    
    private String Availablity;
    private String Departure;
    private int Manufacturedyear;
    private String Type;
    private String Airliner;
    private int AvailableSeats;
    private String SerialNumber;
    private String ModelNumber;
    private String Destination;
    private String StartPoint;
    private String License;

    public String getAvailablity() {
        return Availablity;
    }

    public void setAvailablity(String Availablity) {
        this.Availablity = Availablity;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public int getManufacturedyear() {
        return Manufacturedyear;
    }

    public void setManufacturedyear(int  manu) {
        this.Manufacturedyear = manu;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAirliner() {
        return Airliner;
    }

    public void setAirliner(String Airliner) {
        this.Airliner = Airliner;
    }

    public int getAvailableSeats() {
        return AvailableSeats;
    }

    public void setAvailableSeats(int AvailableSeats) {
        this.AvailableSeats = AvailableSeats;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getStartPoint() {
        return StartPoint;
    }

    public void setStartPoint(String StartPoint) {
        this.StartPoint = StartPoint;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String License) {
        this.License = License;
    }
  
      @Override
    public String toString(){
    
        return this.SerialNumber;

    }
}
