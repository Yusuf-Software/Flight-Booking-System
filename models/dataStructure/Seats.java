package models.dataStructure;

import models.data.ClassName;
import models.data.Seat;

import java.util.List;

public class Seats {
    List<Seat> seats;

    void addSeat(String Id, String seatNo, ClassName className) {
        Seat s = new Seat(Id, seatNo, className);
        seats.add(s);
    }
}
