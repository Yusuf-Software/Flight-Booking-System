package models.data;

import java.io.Serializable;
import java.util.List;


    public record Role(int ID, String name) implements Serializable {

    }



// Roles to be created
//    enum Role
//    {
//        CUSTOMER, AIRLINE_MANAGER, AIRLINE_ADMIN,
//        AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT,
//        AGENCY_ADMIN, AGENCY_SALES_PERSON
//    }