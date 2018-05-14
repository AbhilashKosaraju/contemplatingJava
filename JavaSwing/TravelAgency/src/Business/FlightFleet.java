package Business;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.Flight;
import java.util.ArrayList;
import Business.AirLiner;


/**
 *
 * @author AbhilashKosaraju
 */
public class FlightFleet {

    private static ArrayList<AirLiner> Flightfleet;

    public FlightFleet() {
        Flightfleet = new ArrayList<AirLiner>();

    }

    public static ArrayList<AirLiner> getFlightfleet() {
        return Flightfleet;
    }

    public static void setFlightfleet(ArrayList<AirLiner> Flightfleet) {
        FlightFleet.Flightfleet = Flightfleet;
    }

    public static AirLiner addAirliner() {
        AirLiner a = new AirLiner();
        Flightfleet.add(a);
        return a;
    }

    public void deleteAirliner(AirLiner air) {
        Flightfleet.remove(air);
    }

    public AirLiner searchAirliner(String airline) {
        for (AirLiner air : Flightfleet) {
            if (air.getName().equals(airline)) {
                return air;
            }
        }
        return null;
    }

    public ArrayList<AirLiner> searchAirplanes(String startpoint, String destination) {
        ArrayList<AirLiner> tempfleet = new ArrayList<AirLiner>();
        for (AirLiner air : Flightfleet) {
            if (air.getF().getStartpoint().toLowerCase().equals(startpoint) & air.getF().getDestination().toLowerCase().equals(destination)) {
                {
                    tempfleet.add(air);
                }
                return tempfleet;
            }
        }
        return null;
    }
}
