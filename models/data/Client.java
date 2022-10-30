package models.data;

public class Client {
    private int ID;
    String type;

    public Client(int ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    public int getID() {
        return ID;
    }
}

// Client types to be created to be created

//    enum Client{AGENCY_SALES_PERSON, AIRLINE_SALES_PERSON, CUSTOMER}

//    Agency Sales Person
//    Airline Sales
//    Customer