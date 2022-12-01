package models.database;

import models.data.Schedule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbSchedule
{
    public static int addSchedule(Schedule schedule)throws ClassNotFoundException,SQLException {
        String SQL="INSERT INTO schedule VALUES(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setInt(1, schedule.getFlight().ID());
        stm.setInt(2, schedule.getDepartureAirport().ID());
        stm.setInt(3, schedule.getArrivalAirport().ID());
        stm.setDate(4, schedule.getDepartureDateTime());
        stm.setDate(5, schedule.getArrivalDateTime());
        stm.setString(6, schedule.getStatus().toString());
        return  stm.executeUpdate();
    }
    public static Schedule searchSchedule(Integer Id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM schedule WHERE Id = ? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Id);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            Schedule s=new Schedule(dbFlight.searchFlight(rst.getInt(1)),
                    null,
                    null,
                    rst.getDate(4),
                    rst.getDate(5),
                     null);
            return s;
        }
        return null;
    }

    public static int deleteSchedule(String Id) throws ClassNotFoundException, SQLException
    {

        String sql = "DELETE FROM schedule WHERE Id ='"+Id+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        return  stm.executeUpdate();
    }

    public static int updateSchedule(Schedule schedule)throws ClassNotFoundException,SQLException {
        String SQL="UPDATE schedule SET flight=?,departureAirport=?,arrivalAirport=?,departureDateTime=?,arrivalDateTime=?,status=?,fare=? WHERE Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setInt(1, schedule.getFlight().ID());
        stm.setInt(2, schedule.getDepartureAirport().ID());
        stm.setInt(3, schedule.getArrivalAirport().ID());
        stm.setDate(4, schedule.getDepartureDateTime());
        stm.setDate(5, schedule.getArrivalDateTime());
        stm.setString(6, schedule.getStatus().toString());

        return  stm.executeUpdate();
    }
}
