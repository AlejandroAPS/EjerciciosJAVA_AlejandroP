import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal2 {
    public static void main(String[] args) {

        // Paso 1: Cargar el driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Se ha cargado el Driver de MySQL");
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha encontrado el driver para MySQL");
            return;
        }

        // Paso 2: Establecer conexión
        String cadenaConexion = "jdbc:mysql://localhost:3306/FERRETERIA";
        String user = "root";
        String pass = "amelia";

        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)) {

            System.out.println("Se ha establecido la conexión con la Base de datos");

            try {
                con.setAutoCommit(false);
                Statement sentencia = con.createStatement();

                String sql;

                sql = "INSERT INTO CLIENTE VALUES ('51666666A','ROCAFLOR DELGADO RODOLFO','C/ PITONISA, 45','616656644','SEVILLA')";
                sentencia.executeUpdate(sql);

                sql = "INSERT INTO FACTURA VALUES (5446,'2018-04-23', 0, '51666666A')";
                sentencia.executeUpdate(sql);

                sql = "INSERT INTO DETALLE VALUES (5446,'MAR2', 1, 7)";
                sentencia.executeUpdate(sql);

                sql = "INSERT INTO DETALLE VALUES (5446,'TOR7', 2, 0.8)";
                sentencia.executeUpdate(sql);

                sql = "UPDATE PRODUCTO SET STOCK=STOCK-1 WHERE CODIGO='MAR2'";
                sentencia.executeUpdate(sql);

                // ERROR APOSTA STOCKKK
                sql = "UPDATE PRODUCTO SET STOCK=STOCKKK-2 WHERE CODIGO='TOR7'";
                sentencia.executeUpdate(sql);

                con.commit();
                System.out.println("Transacción completada correctamente");

            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error al añadir la factura");
                System.out.println(e.getMessage());
                con.rollback();
                System.out.println("Rollback realizado");
            }

        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexión con la BD");
            System.out.println(e.getMessage());
        }

        System.out.println("Se ha cerrado la base de datos");
    }
}