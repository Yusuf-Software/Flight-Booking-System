package models.data;

import java.io.Serializable;

public class FlightSeat extends Seat implements Serializable
{
    private double price;
    private Status status;
    private int luggaeWeight;
    public FlightSeat(String Id, String seatNo, ClassName className, double price, Status status, int luggaeWeight)
    {
        super(Id, seatNo, className);
        this.price = price;
        this.status = status;
        this.luggaeWeight = luggaeWeight;
    }

    public double getPrice() {
        return price;
    }

    public enum Status{OPEN, BOOKED}
}
