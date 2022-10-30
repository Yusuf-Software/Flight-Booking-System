package models.data;

import java.io.Serializable;

public record Country(int ID, String name, String code) implements Serializable {

}
//    Country Code
//    Country Name