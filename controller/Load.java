package controller;

import models.data.City;
import models.data.Country;
import models.dataStructure.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Load {
    private ArrayList<Object> objects = null;

    private Agencies agencies = null;
    private Airlines airlines = null;
    private Airports airports = null;
    private Bookings bookings = null;
    private Cities cities = null;
    private Clients clients = null;
    private Countries countries = null;
    private Flights flights = null;
    private FlightSeats flightSeats = null;
    private Passengers passengers = null;
    private People people = null;
    private Roles roles = null;
    private Schedules schedules = null;
    private Seats seats = null;
    private Tickets tickets = null;

    public Load() {


        try {
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);


            objects = (ArrayList<Object>) in.readObject();
            in.close();
            fileIn.close();

            if (objects != null) {
                for (Object object : objects) {
                    if (object instanceof Agencies) agencies = (Agencies) object;
                    else if (object instanceof Airlines) airlines = (Airlines) object;
                    else if (object instanceof Airports) airports = (Airports) object;
                    else if (object instanceof Bookings) bookings = (Bookings) object;
                    else if (object instanceof Cities) cities = (Cities) object;
                    else if (object instanceof Clients) clients = (Clients) object;
                    else if (object instanceof Countries) countries = (Countries) object;
                    else if (object instanceof Flights) flights = (Flights) object;
                    else if (object instanceof FlightSeats) flightSeats = (FlightSeats) object;
                    else if (object instanceof Passengers) passengers = (Passengers) object;
                    else if (object instanceof People) people = (People) object;
                    else if (object instanceof Roles) roles = (Roles) object;
                    else if (object instanceof Schedules) schedules = (Schedules) object;
                    else if (object instanceof Seats) seats = (Seats) object;
                    else if (object instanceof Tickets) tickets = (Tickets) object;
                }
            }
//            System.out.println(objects);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public Agencies getAgencies() {
        return agencies;
    }

    public Airlines getAirlines() {
        return airlines;
    }

    public Airports getAirports() {
        return airports;
    }

    public Bookings getBookings() {
        return bookings;
    }

    public Cities getCities() {
        return cities;
    }

    public Clients getClients() {
        return clients;
    }

    public Countries getCountries() {
        return countries;
    }

    public Flights getFlights() {
        return flights;
    }

    public FlightSeats getFlightSeats() {
        return flightSeats;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public People getPeople() {
        return people;
    }

    public Roles getRoles() {
        return roles;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public Seats getSeats() {
        return seats;
    }

    public Tickets getTickets() {
        return tickets;
    }
}
