/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.AirPlanes;
import java.util.ArrayList;


public class AirPlaneFleet {
    
    private ArrayList<AirPlanes> Fleet;
    private ArrayList<AirPlanes> Fleetcache;
    
    public AirPlaneFleet(){
        
      Fleet = new ArrayList<AirPlanes>();
      Fleetcache = new ArrayList<AirPlanes>();
      
    }

    public ArrayList<AirPlanes> getFleet() {
        return Fleet;
    }

    public ArrayList<AirPlanes> getFleetcache() {
        return Fleetcache;
    }

    public void setFleetcache(ArrayList<AirPlanes> Fleetcache) {
        this.Fleetcache = Fleetcache;
    }

    public void setFleet(ArrayList<AirPlanes> Fleet) {
        this.Fleet = Fleet;
    }
    
    public AirPlanes addPlanes()
    {
         AirPlanes ap = new AirPlanes();
         Fleet.add(ap);
         return ap;
    }
    
    public void addtempPlanes(AirPlanes ap )
    {
        System.out.println("Inside For");
        Fleetcache.add(ap);
    }
    
    public void updatePlane(AirPlanes a)
    {
        Fleet.remove(a);
    }

   
    
}
