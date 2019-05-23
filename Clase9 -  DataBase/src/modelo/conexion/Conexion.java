package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * En esta clase tendremos la cadena de conexion con que trabajara nuestra
 * aplicación , en esta se definira la Base de datos , el user , la password y
 * el driver de conexion por defecto los datos de login de MySql son LOGIN =
 * root Password =vacio *
 */
public class Conexion {

	static String db = "personas";// nombre de mi base de datos
	static String login = "root";// nombre de usuario de la DB
	static String password = "";//contraseña de la base de datos
	static String url = "jdbc:mysql://localhost/" + db;

	// creamos un objeto de tipo conection
	Connection conn = null;

	/** Constructor de BDconnection */
	public Conexion() {

		try {
			// Obtener el driver para MySql
			Class.forName("com.mysql.jdbc.Driver");

			// obtenemos nuestra conexion
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Conexion a la base de datos " + db + " OK");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** metodo que nos retorna la conexion */
	public Connection getConnection() {
		return conn;
	}

	// metodo para DESCONECTAR A LA db
	public void desconectar() {
		conn = null;
	}
}
