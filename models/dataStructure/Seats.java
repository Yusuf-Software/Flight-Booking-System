package models.dataStructure;

import models.data.ClassName;
import models.data.Seat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Seats implements Serializable {
    List<Seat> seats = new ArrayList<>();

    void addSeat(String Id, String seatNo, ClassName className) {
        Seat s = new Seat(Id, seatNo, className);
        seats.add(s);
    }
}
