package models.data; //package models;

import java.util.List;

public record Airport(int ID, City city, String airportName, String code, List<Flight> flights) {

}