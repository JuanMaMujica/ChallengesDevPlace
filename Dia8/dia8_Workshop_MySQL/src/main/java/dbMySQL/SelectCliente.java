package dbMySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.ModelCliente;

public class SelectCliente {
	
	public SelectCliente(ModelCliente modelCliente) {
		DataBase dbc = new DataBase();
		if(dbc.getConnection()!=null) {
			try {
				String query = "SELECT * FROM Cliente WHERE dni=?";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setInt(1, modelCliente.getDni());
				ResultSet rs = st.executeQuery();
				if(rs.next()) {
					modelCliente.setDni(rs.getInt(1));
					modelCliente.setNombre(rs.getString(2));
					modelCliente.setApellido(rs.getString(3));
					modelCliente.setDireccion(rs.getString(4));
					modelCliente.setFechaNacimiento(rs.getDate(5));
				}
				
			}catch(Exception e) {
				System.out.println("Error en la seleccion");
			}
		}
	}
}
