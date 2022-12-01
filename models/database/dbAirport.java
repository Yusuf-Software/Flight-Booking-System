package models.database;

import models.data.Airport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbAirport
{
    public static int addAirport(Airport airport)throws ClassNotFoundException,SQLException {
        String SQL="INSERT INTO airport VALUES(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setInt(1, airport.ID());
        stm.setInt(2, airport.city().ID());
        stm.setString(3, airport.name());
        stm.setString(4, airport.code());

        return  stm.executeUpdate();
    }
    public static Airport searchAirport(Integer Id) throws ClassNotFoundException, SQLException
    {
        String sql = "SELECT * FROM airport WHERE Id = ? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Id);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            Airport a=new Airport(rst.getInt(1),
                    null,
                    rst.getString(3),
                    rst.getString(4));
            return a;
        }
        return null;
    }

    public static int deleteAirport(String Id) throws ClassNotFoundException, SQLException {

        String sql = "DELETE FROM airport WHERE Id ='"+Id+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        return  stm.executeUpdate();
    }

    public static int updateAirport(Airport airport)throws ClassNotFoundException,SQLException {
        String SQL="UPDATE airport SET city=?,name=?,code=? WHERE Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setInt(1, airport.ID());
        stm.setInt(2, airport.city().ID());
        stm.setString(3, airport.name());
        stm.setString(4, airport.code());

        return  stm.executeUpdate();
    }

}
