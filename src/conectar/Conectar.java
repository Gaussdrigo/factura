package conectar;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    public static void main(String[] args) throws SQLException {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/boutique";
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("CONEXION ESTABLECIDA");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion" + e);
        }
        String comprobar = "d";
        System.out.println(comprobar.isEmpty());
    }
}
