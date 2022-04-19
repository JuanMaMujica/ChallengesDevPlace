package dbMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private static final String url = "jdbc:mysql://localhost:3306/dia8_challenge";	
	private static final String user= "root";
	private static final String pass="1234";
	private Connection db = null;
	
	public DataBase () {
		try {
			this.db = DriverManager.getConnection(url,user,pass);	//DriverManager pertenece a la libreria sql permite obtener la coneccion a la db
			System.out.println("Se conecto");
		} catch (SQLException e) {
			System.out.println("Error. No se conecto");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.db;
	}
	
	public void close() {
		
		if(this.db!=null) {
			try {
				this.db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
