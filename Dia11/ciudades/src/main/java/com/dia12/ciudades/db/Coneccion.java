package com.dia12.ciudades.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
	private static final String url = "jdbc:mysql://localhost:3306/ciudadesdb";
	private static final String user = "root";
	private static final String pass = "1234";
	private Connection con = null;
	
	public Coneccion() {
		try {
			this.con = DriverManager.getConnection(url,user,pass);	//DriverManager pertenece a la libreria sql permite obtener la coneccion a la db
			//System.out.println("Se conecto");
		} catch (SQLException e) {
			//System.out.println("Error. No se conecto");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.con;
	}
	
	public void close() {
		if(this.con!=null) {
			try {
				this.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
