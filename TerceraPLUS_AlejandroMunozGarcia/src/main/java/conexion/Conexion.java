package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AMG
 */
public class Conexion {

    public static Connection con;
    private static final String conector = "jdbc:mysql://localhost:3306/tributos";
    private static final String usuario= "root";
    private static final String pass="mysql";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(conector, usuario, pass);

        }
        return con;
    }

    public static void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            //Guarda la excepción en un fichero de log
        }
        
        con = null;
    }

}
