package models; //package models;

import models.Flight;

import java.util.List;

public record Airline(int ID, String name, List<Flight> flights) {

}

//    Airline (R)
//    ID
//    Name
//    List<Flight> flights