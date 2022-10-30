package models.data; //package models;


//public record Agency(String agencyCode, String Name, Person agencyAdmin, String email, String phone, String web, String address, double balance) {
//    public Agency {
//        balance = 0;
//    }
//}

import java.io.Serializable;

public class Agency implements Serializable {
    private String agencyCode;
    private String Name;
    private Person agencyAdmin;
    private String email;
    private String phone;
    private String web;
    private String address;
    private double balance;
    public Agency(String agencyCode, String Name, Person agencyAdmin, String email, String phone, String web, String address) {
        this.agencyCode = agencyCode;
        this.Name = Name;
        this.agencyAdmin = agencyAdmin;
        this.email = email;
        this.phone = phone;
        this.web = web;
        this.address = address;
        this.balance = 0;
    }

    public Agency(String agencyCode, String Name, Person agencyAdmin, String email, String phone, String web, String address, double balance) {
        this(agencyCode, Name, agencyAdmin, email, phone, web, address);
        this.balance = balance;
    }

    public String agencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String name() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Person agencyAdmin() {
        return agencyAdmin;
    }

    public void setAgencyAdmin(Person agencyAdmin) {
        this.agencyAdmin = agencyAdmin;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String phone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String web() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double balance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//        models.data.Agency Code
//        models.data.Agency Name
//        models.data.Agency Manager
//        E-mail
//        Office Phone
//        Web address
//        Address



























