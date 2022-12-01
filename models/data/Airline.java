package models.data; //package models;

import java.io.Serializable;
import java.util.List;

public record Airline(String ID, String name) implements Serializable {

}

//    Airline (R)
//    ID
//    Name
//    List<Flight> flights