import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal4 {
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
        String cadenaConexion = "jdbc:mysql://localhost:3306/TIENDA";
        String user = "root";
        String pass = "curso";

        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)) {

            System.out.println("Se ha establecido la conexión con la BD");

            // Paso 3: Interactuar con la BD
            String sql = "INSERT INTO CLIENTE (NIF, NOMBRE, DOMICILIO, TLF, CIUDAD) VALUES (?, ?, ?, ?, ?)";

            String nif = "55667788A";
            String nombre = "DELGADO PEREZ CARLOS";
            String domicilio = "C/ ALENZA, 7";
            String tlf = "616667766";
            String ciudad = "MADRID";

            System.out.println("Se va a ejecutar la sentencia SQL:");
            System.out.println(sql);

            try (PreparedStatement sentencia = con.prepareStatement(sql)) {

                sentencia.setString(1, nif);
                sentencia.setString(2, nombre);
                sentencia.setString(3, domicilio);
                sentencia.setString(4, tlf);
                sentencia.setString(5, ciudad);

                int afectados = sentencia.executeUpdate();

                System.out.println("Sentencia SQL ejecutada con éxito");
                System.out.println("Registros afectados: " + afectados);

            } catch (SQLException e) {
                System.out.println("Error al añadir nuevo cliente");
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexión");
            System.out.println(e.getMessage());
        }

        System.out.println("Se ha cerrado la base de datos");
    }
}