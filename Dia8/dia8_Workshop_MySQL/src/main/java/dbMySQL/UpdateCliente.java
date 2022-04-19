package dbMySQL;

import java.sql.PreparedStatement;

import models.ModelCliente;

public class UpdateCliente {
	private boolean modificado=false;

	public UpdateCliente(ModelCliente modelCliente) {
		
		DataBase dbc = new DataBase();
		if(dbc.getConnection()!=null){
			try {
				String query = "UPDATE Cliente SET nombre=?,apellido=?,direccion=?,fechaNacimiento=? WHERE dni=?";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setString(1, modelCliente.getNombre());
				st.setString(2, modelCliente.getApellido());
				st.setString(3, modelCliente.getDireccion());
				st.setDate(4, modelCliente.getFechaNacimiento());
				st.setInt(5, modelCliente.getDni());
				st.executeUpdate();
				this.modificado=true;
				dbc.close();
				
			}catch(Exception e) {
				System.out.println("Error en el update");
			}
		}
	}

	public boolean isModificado() {
		return modificado;
	}
	
	
	
	
}
