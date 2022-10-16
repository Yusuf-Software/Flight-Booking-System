package models; //package models;
import models.City;
import models.Flight;

import java.util.List;

public record Airport(int ID, City city, String airportName, String code, List<Flight> flights) {

}