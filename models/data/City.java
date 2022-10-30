package models.data; //package models;

import java.io.Serializable;

public record City(int ID, String name, Country country) implements Serializable {

}

//City ID
//City Name