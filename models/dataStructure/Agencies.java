package models.dataStructure;

import models.data.Agency;
import models.data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencies {
    List<Agency> agencies;

    public Agencies(List<Agency> agencies) {
        this.agencies = agencies;
    }


    void addAgency(String name, String code, Person admin, String email, String phone, String web, String address) {
        Agency a = new Agency(name, code, admin, email, phone, web, address);
        agencies.add(a);
    }


    void deleteAgencyByCode(String agencyCode) {
        agencies.removeIf(agency -> agency.agencyCode().equals(agencyCode));
    }

    void updateAgencyByCode(String agencyCode, Agency agency) {
        agencies.removeIf(agency1 -> agency1.agencyCode().equals(agencyCode));
        Agency a = new Agency(agencyCode, agency.name(), agency.agencyAdmin(), agency.email(), agency.phone(), agency.web(), agency.address(), agency.balance());
        agencies.add(a);
    }

    public List<Agency> getAgencies() {
        return agencies;
    }

    List<String> getAgencyNames() {
        List<String> agencyNames = new ArrayList<>();
        agencies.forEach(agency -> agencyNames.add(agency.name()));
        return agencyNames;
    }


    public int getAgencyCount() {
        return agencies.size();
    }

    void addBalanceByAgencyCode(String agencyCode, double amount) {
        List<Agency> agencyList = agencies.stream().filter(agency -> agency.agencyCode().equals(agencyCode)).collect(Collectors.toList());
        agencyList.get(0).setBalance(agencyList.get(0).balance() + amount);
//                .forEach(agency -> agency.balance() += amount);
    }


    @Override
    public String toString() {
        return "Agencies{" +
                "agencies=" + agencies +
                '}';
    }

}
