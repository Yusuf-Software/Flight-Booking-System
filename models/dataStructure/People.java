package models.dataStructure;

import models.data.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> people;

    void addPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Agency agency, String nationality, Double point, Image profilePic) {
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, airline, agency, nationality, point, profilePic);
        people.add(p);
    }


    void addAgencySalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Agency agency, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AGENCY_SALES_PERSON");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, null, agency, null, point, profilePic);
        people.add(p);
    }

    void addAirlineSalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AIRLINE_SALES_PERSON");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, airline, null, null, point, profilePic);
        people.add(p);
    }

    void addAgencyManager(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Agency agency, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AGENCY_MANAGER");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, null, agency, null, point, profilePic);
        people.add(p);
    }

    void addAirlineManager(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AIRLINE_MANAGER");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, airline, null, null, point, profilePic);
        people.add(p);
    }

    void addAirlineAccountant(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AIRLINE_ACCOUNTANT");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, airline, null, null, point, profilePic);
        people.add(p);
    }

    void addAirlineAdmin(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("AIRLINE_ADMIN");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, airline, null, null, point, profilePic);
        people.add(p);
    }

    void addCustomer(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Double point, Image profilePic) {
        Role r = Roles.getRoleByName("CUSTOMER");
        Person p = new Person(firstName, lastName, email, username, password, Id, phoneNo, role, null, null, null, point, profilePic);
        people.add(p);
    }



    public List<Person> getPeople() {
        return people;
    }


}
