package models.data;
public class FlightSeat extends Seat
{
    private double price;
    private Status status;
    public FlightSeat(String Id, String seatNo, ClassName className)
    {
        super(Id, seatNo, className);
    }

    enum Status{OPEN, BOOKED}
}
