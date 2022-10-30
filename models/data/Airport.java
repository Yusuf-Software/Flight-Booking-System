package models.data; //package models;

import java.io.Serializable;
import java.util.List;

public record Airport(int ID, City city, String name, String code) implements Serializable {

}