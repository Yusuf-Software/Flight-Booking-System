package models.database;
import models.data.Person;

import java.sql.*;

public class dbPerson
{

        public static int addPerson(Person person)throws ClassNotFoundException,SQLException {
            String SQL="INSERT INTO person VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL);
            stm.setString(1, person.getId());
            stm.setString(2, person.getRole().ID());
            stm.setString(3, person.getAgency().agencyCode());
            stm.setString(4, person.getAirline().ID());
            stm.setDouble(5, person.getPoint());
            stm.setString(6, person.getNationality());
            stm.setString(7, person.getFirstName());
            stm.setString(8, person.getLastName());
            stm.setString(9, person.getEmail());
            stm.setString(10, person.getUsername());
            stm.setString(11, person.getPassword());
            stm.setString(12, person.getPhoneNo());

            return  stm.executeUpdate();
        }
        public static Person searchPerson(Integer Id) throws ClassNotFoundException, SQLException {
            String sql = "SELECT * FROM person WHERE Id = ? ";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, Id);
            ResultSet rst=stm.executeQuery();
            if(rst.next()){
                Person p=new Person(rst.getString(7),
                        rst.getString(8),
                        rst.getString(9),
                        rst.getString(10),
                        rst.getString(11),
                        rst.getString(12),
                        rst.getString(7),
                        null,
                        null,
                        null,
                        rst.getString(6),
                        rst.getDouble(5),
                        null);
                return p;
            }
            return null;
        }

        public static int deletePerson(String Id) throws ClassNotFoundException, SQLException {

            String sql = "DELETE FROM person WHERE Id ='"+Id+"'";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            return  stm.executeUpdate();
        }

        public static int updatePerson(Person person) throws ClassNotFoundException, SQLException {
            String sql = "UPDATE person SET Id= ? ,fullName= ? ,name= ? ,dob= ? ,doa= ? ,gender= ? ,grade=? ,parentName= ? ,nic= ? ,phone= ? ,address=? WHERE Id= '" +person.getId()+ "'";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, person.getId());
            stm.setString(2, person.getRole().ID());
            stm.setString(3, person.getAgency().agencyCode());
            stm.setString(4, person.getAirline().ID());
            stm.setDouble(5, person.getPoint());
            stm.setString(6, person.getNationality());
            stm.setString(7, person.getFirstName());
            stm.setString(8, person.getLastName());
            stm.setString(9, person.getEmail());
            stm.setString(10, person.getUsername());
            stm.setString(11, person.getPassword());
            stm.setString(12, person.getPhoneNo());

            return  stm.executeUpdate();
        }
}

