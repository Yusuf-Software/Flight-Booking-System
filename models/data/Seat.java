package models.data;

import java.io.Serializable;

public class Seat implements Serializable
{
    protected String Id, seatNo;
    protected ClassName className;

    public Seat(String Id, String seatNo, ClassName className)
    {
        this.Id = Id;
        this.seatNo = seatNo;
        this.className = className;
    }
}