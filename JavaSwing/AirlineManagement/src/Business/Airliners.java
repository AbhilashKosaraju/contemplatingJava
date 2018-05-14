/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Flight;
import java.util.ArrayList;

/**
 *
 * @author Abhilash Kosaraju
 */
public class Airliners {

    private static ArrayList<Flight> Flightfleet;
    Flight flight = new Flight();

    public ArrayList<Flight> getFlightfleet() {
        return Flightfleet;
    }

    public void setFlightfleet(ArrayList<Flight> Flightfleet) {
        this.Flightfleet = Flightfleet;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airliners() {
        Flightfleet = new ArrayList<Flight>();
    }

    public static Flight addflights() {
        Flight f = new Flight();
        Flightfleet.add(f);
        return f;
    }

}
