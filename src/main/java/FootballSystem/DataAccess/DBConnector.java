package FootballSystem.DataAccess;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class DBConnector {

    private static final DBConnector instance = new DBConnector();

    //<editor-fold desc="Constructors">
    //private constructor to avoid client applications to use constructor
    public static DBConnector getInstance(){
        return instance;
    }

    private DBConnector() {

    }
    //</editor-fold>


    /**
     * Get a connection to database
     *
     * @return Connection object
     */
    public static Connection getConnection() {
        try {
            String host = "jdbc:mysql://132.72.65.99:3306/football_system?useLegacyDatetimeCode=false&serverTimezone=UTC";
            String uName = "root";
            String uPass = "root";
            Connection con = DriverManager.getConnection(host, uName, uPass);


            //check connect
////            try {
////                Statement stat = con.createStatement();
////                String sql = "select * from Score_Policy";
////                ResultSet rs = stat.executeQuery(sql);
////
////                while (rs.next()) {
////                    int id_col = rs.getInt("code");
////                    String fullName = rs.getString("policyName");
////                    String p = id_col +  " " + fullName ;
////                    System.out.println(p);
////                }
////                con.close();
////
////            }catch (SQLException err) {
////                throw new RuntimeException("Error connecting to the database", err);
////            }

            return con;

        } catch (SQLException err) {
            throw new RuntimeException("Error connecting to the database", err);
        }
    }
    /**
     * Test Connection
     */


}

