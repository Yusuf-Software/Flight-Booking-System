package models.data; //package models;

import java.util.List;

public record Airline(int ID, String name, List<Flight> flights) {

}

//    Airline (R)
//    ID
//    Name
//    List<Flight> flights