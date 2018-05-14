/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVReader;

import Business.Airliners;
import Business.CustomerDirectory;
import Business.Customer;
import Business.Seats;
import Business.Flight;
import Business.MasterSchedule;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author Abhilash Kosaraju
 */
public class TravelAgency {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        String filepath = "C:\\Users\\sowjanya\\Documents\\NetBeansProjects\\Homework3\\src\\Book1.csv";
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        String StringRead = br.readLine();

        Airliners airplaneList = new Airliners();
        CustomerDirectory cusd = new CustomerDirectory();
        MasterSchedule mas = new MasterSchedule();

        while (StringRead != null) {
            Seats s = new Seats();
            StringTokenizer st = new StringTokenizer(StringRead, ",");

            String Serial = st.nextToken().trim();
            String ModelNumber = st.nextToken().trim();
            String StartPoint = st.nextToken().trim();
            String Destination = st.nextToken().trim();
            String cost = st.nextToken().trim();
            String Airliner = st.nextToken().trim();
            String Availableseats = st.nextToken().trim();
            String Reservedseats = st.nextToken().trim();

            Flight f = airplaneList.addflights();

            f.setModel(ModelNumber);
            f.setStartpoint(StartPoint);
            f.setSerialNumber(Integer.parseInt(Serial));
            f.setDestination(Destination);
            f.setCost(Integer.parseInt(cost));
            f.setAirline(Airliner);
            s.setAvailableseats(Integer.parseInt(Availableseats));
            s.setReservedseats(Integer.parseInt(Reservedseats));
            f.setSeat(s);

            StringRead = br.readLine();
        }
        br.close();

        String filepaths = "C:\\Users\\sowjanya\\Documents\\NetBeansProjects\\Homework3\\src\\Book22.csv";
        FileReader frr = new FileReader(filepaths);
        BufferedReader brr = new BufferedReader(frr);
        String StringReads = brr.readLine();

        while (StringReads != null) {
            Seats s = new Seats();

            StringTokenizer stt = new StringTokenizer(StringReads, ",");
            String Name = stt.nextToken().trim();
            String Gender = stt.nextToken().trim();
            String Passport = stt.nextToken().trim();
            String seat = stt.nextToken().trim();
            String serial = stt.nextToken().trim();

            Customer cus = CustomerDirectory.addCustomers();
            cus.setName(Name);
            cus.setGender(Gender);
            cus.setPassportnumber(Passport);
            cus.setFlightserial(serial);
            s.setSeat(seat);
            cus.setSearial(serial);
            cus.setS(s);
            StringReads = brr.readLine();
        }
        brr.close();

        int m = 1;
        System.out.println("The MASTER SCHEDULE : \n \nThe Flight Catalog\n");
        for (Flight fl : mas.getAir().getFlightfleet()) {
            System.out.println(m + ":Airport-->" + fl.getStartpoint() + "\tModel-->" + fl.getModel() + "\tDestination-->" + fl.getDestination() + "\tSerial-->" + fl.getSerialNumber() + "\tAvailableSeats-->" + fl.getSeat().getAvailableseats() + "\tReservedSeats-->" + fl.getSeat().getReservedseats() + "\tAirliner-->" + fl.getAirline());
            m++;
        }
        System.out.println("\n\n\n");
        System.out.println("The Customer Directory\n");
        int mm = 1;
        for (Customer cust : mas.getDir().getDirectory()) {
            System.out.println(mm + ":Name-->" + cust.getName() + "\t\tGender-->" + cust.getGender() + "\t\tPassport Number-->" + cust.getPassportnumber() + "\t\tSeat-->" + cust.getS().getSeat() + "\t\tserial-->" + cust.getSearial());
            mm++;
        }

        HashSet hs = new HashSet();
        for (Flight f : airplaneList.getFlightfleet()) {

            hs.add(f.getSerialNumber());

        }

        System.out.println("\n The serial numbers of the filghts in the fleet catalog" + "\t\t" + hs + "\n");
        ArrayList<Integer> list = new ArrayList<Integer>(hs);

        int revenue = 0;
        for (int k = 0; k < hs.size(); k++) {
            for (Flight f : airplaneList.getFlightfleet()) {
                if (f.getSerialNumber() == list.get(k)) {
                    revenue = revenue + ((f.getCost()) * (f.getSeat().getReservedseats()));
                }
            }
            System.out.println("The Revenue of the flight with the serial number " + list.get(k) + "is\t" + revenue);
            revenue = 0;
        }

        HashSet hss = new HashSet();
        for (Flight f : airplaneList.getFlightfleet()) {

            hss.add(f.getAirline());

        }
        System.out.println("\n\n The Airlines in the Catalog are" + "\t\t" + hss + "\n");

        ArrayList<String> airlist = new ArrayList<String>(hss);
        int TotalRevenue = 0;
        int airrevenue = 0;
        for (int z = 0; z < hss.size(); z++) {
            for (Flight f : airplaneList.getFlightfleet()) {
                if (f.getAirline().equals(airlist.get(z))) {
                    airrevenue = airrevenue + ((f.getCost()) * (f.getSeat().getReservedseats()));
                }

            }
            System.out.println("The Revenue of the Airline\t" + airlist.get(z) + "\t\t\t" + airrevenue);
            TotalRevenue = TotalRevenue + airrevenue;
            airrevenue = 0;
        }

        HashSet chs = new HashSet();
        for (Customer cus : cusd.getDirectory()) {
            chs.add(cus.getSearial());
        }
        System.out.println("\n\n The serial Numbers of the planes in the Customer Directory " + "\t" + chs + "\n");
        ArrayList<Integer> clist = new ArrayList<Integer>(chs);

        int ncustomers = 0;
        for (int z = 0; z < hss.size(); z++) {
            for (Customer cus : cusd.getDirectory()) {
                if (cus.getSearial().equals(clist.get(z))) {
                    System.out.println(" Passenger Details in " + clist.get(z) + "\n" + "Seat position : " + cus.getS().getSeat() + "\t\t\tPassport Number :" + cus.getPassportnumber() + "\n");
                    ncustomers = ncustomers + 1;
                    //System.out.println(ncustomers);
                }
            }
            System.out.println("The number of passengers in \t" + clist.get(z) + "\t is \t" + ncustomers + "\n");
            ncustomers = 0;
        }
        System.out.println("\n\nThe Total Revenue of the Airlines is " + TotalRevenue);
    }
}
