package models;
public class Seat
{
    protected String Id, seatNo;
    protected ClassName  className;

    public Seat(String Id, String seatNo, ClassName className)
    {
        this.Id = Id;
        this.seatNo = seatNo;
        this.className = className;
    }

    enum ClassName{ECONOMY, BUSINESS, FIRST_CLASS}
}


