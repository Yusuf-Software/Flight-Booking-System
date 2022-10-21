package models;

import java.util.List;

public class Role {
    int ID;
    String role;

    public Role(int ID, String role) {
        this.ID = ID;
        this.role = role;
    }
}


// Roles to be created
//    enum Role
//    {
//        CUSTOMER, AIRLINE_MANAGER, AIRLINE_ADMIN,
//        AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT,
//        AGENCY_ADMIN, AGENCY_SALES_PERSON
//    }