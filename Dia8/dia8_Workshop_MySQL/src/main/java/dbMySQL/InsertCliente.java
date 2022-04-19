package dbMySQL;

import java.sql.PreparedStatement;

import models.ModelCliente;

public class InsertCliente {
	private boolean insertado=false;

	public InsertCliente(ModelCliente modelCliente) {
		DataBase dbc = new DataBase();
		
		if(dbc.getConnection()!=null) {
			try {
				String query = "INSERT INTO Cliente (dni,nombre,apellido,direccion,fechaNacimiento) VALUES(?,?,?,?,?)"; //le indicamos la query en un String
				//prepara la coneccion para recibir la instruccion
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				//Le seteo los valores que vamos a pasarle a la query
				st.setInt(1, modelCliente.getDni());
				st.setString(2, modelCliente.getNombre());
				st.setString(3, modelCliente.getApellido());
				st.setString(4, modelCliente.getDireccion());
				st.setDate(5, modelCliente.getFechaNacimiento());
				//ejecuto la query
				st.executeUpdate();
				this.insertado = true;
				dbc.close();
				
			} catch(Exception e) {
				System.out.println("Error al insertar");
			}
		}
		
	}

	public boolean isInsertado() {
		return insertado;
	}
	
	
	
	
	
	
}	
