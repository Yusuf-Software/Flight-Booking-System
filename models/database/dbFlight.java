package models.database;

import models.data.Flight;
import models.data.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbFlight
{
    public static int addFlight(Flight flight)throws ClassNotFoundException, SQLException
    {
        String SQL="INSERT INTO flight VALUES(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setInt(1, flight.ID());
        stm.setString(2, flight.flightNo());
        stm.setString(3, flight.airline().ID());
        stm.setInt(4, flight.seatCapacity());
        return  stm.executeUpdate();
    }

    public static int deleteFlight(int ID) throws ClassNotFoundException, SQLException
    {
        String sql = "DELETE FROM flight WHERE ID ='"+ID+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        return  stm.executeUpdate();
    }

    public static int updateFlight(Flight flight) throws ClassNotFoundException, SQLException
    {
        String sql = "UPDATE flight SET flightNo = ?, airline = ?, seatCapacity = ? WHERE ID = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, flight.ID());
        stm.setString(2, flight.flightNo());
        stm.setString(3, flight.airline().ID());
        stm.setInt(4, flight.seatCapacity());
        return  stm.executeUpdate();
    }

    public static Flight searchFlight(int ID) throws ClassNotFoundException, SQLException
    {
        String sql = "SELECT * FROM flight WHERE ID = ? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ID);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            Flight f=new Flight(rst.getInt(1),
                    rst.getString(2),
                    null,
                    rst.getInt(4));
            return f;
        }
        return null;
    }

}
