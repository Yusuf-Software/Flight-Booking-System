package controller;

import models.data.City;
import models.data.Country;
import models.dataStructure.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Save {
    ArrayList<Object> objects = new ArrayList<>();
    public Save(Agencies agencies, Airlines airlines, Airports airports, Bookings bookings, Cities cities, Clients clients,
                Countries countries, Flights flights, FlightSeats flightSeats, Passengers passengers, People people, Roles roles,
                Schedules schedules, Seats seats, Tickets tickets) {
        try {
            if(agencies != null) objects.add(agencies);
            if(airlines != null) objects.add(airlines);
            if(airports != null) objects.add(airports);
            if(bookings != null) objects.add(bookings);
            if(cities != null) objects.add(cities);
            if(clients != null) objects.add(clients);
            if(countries != null) objects.add(countries);
            if(flights != null) objects.add(flights);
            if(flightSeats != null) objects.add(flightSeats);
            if(passengers != null) objects.add(passengers);
            if(people != null) objects.add(people);
            if(roles != null) objects.add(roles);
            if(schedules != null) objects.add(schedules);
            if(seats != null) objects.add(seats);
            if(tickets != null) objects.add(tickets);

            FileOutputStream fileOutputStream = new FileOutputStream("data.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

//            Load load = new Load();
//            if (objects == load.getObjects())
//                System.out.println("No edits to save!");

            objectOutputStream.writeObject(objects);
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Serialized data is saved in data.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
