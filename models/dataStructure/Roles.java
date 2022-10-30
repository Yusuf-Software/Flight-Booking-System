package models.dataStructure;

import models.data.Role;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Roles implements Serializable{
    static List<Role> roles = new ArrayList<>();

   static void addRole(int ID, String name) {
        Role r = new Role(ID, name);
        roles.add(r);
    }


    static Role getRoleByName(String name) {
        List<Role> r = roles.stream().filter(role -> role.name().toLowerCase().equals(name.toLowerCase())).collect(Collectors.toList());
        return r.get(0);
    }

    static void deleteRoleByName(String name) {
        roles.removeIf(role -> role.name().equals(name));
    }

    static void updateRoleByName(String name, Role role) {
        roles.removeIf(r -> r.name().equals(name));
        roles.add(role);
    }

    static List<String> getRoleNames() {
        List<String> r = null;
        roles.forEach(role -> r.add(role.name()));
        return r;
    }
}
