package models.dataStructure;

import models.data.Passenger;
import models.data.Role;

import java.io.Serializable;
import java.util.*;


public class Passengers implements Serializable {
    List<Passenger> passengers = new ArrayList<>();

    void addPassenger(String firstName, String surname, String email, String username, String password, String Id, String phoneNo, Role role, String nationality, String passportNo, String gender, Date DOB){
        Passenger p = new Passenger(firstName, surname, email, username, password, Id, phoneNo, role, nationality, passportNo, gender, DOB);
        passengers.add(p);
    }

    List<Passenger> getPassengers() {
        return passengers;
    }

    void deletePassengerByID(String passengerID) {
        passengers.removeIf(passenger -> passenger.getId().equals(passengerID));
    }

    void updatePassengerByID(String passengerID, Passenger passenger) {
        passengers.removeIf(p -> p.getId().equals(passengerID));
        passengers.add(passenger);
    }

    Passenger getPassengerByID(String passengerID) {
        return passengers.stream().filter(passenger -> passenger.getId().equals(passengerID)).findFirst().orElse(null);
    }
}
