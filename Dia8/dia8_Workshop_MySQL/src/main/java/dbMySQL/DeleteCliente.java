package dbMySQL;

import java.sql.PreparedStatement;

import models.ModelCliente;

public class DeleteCliente {
	private boolean deleted=false;

	public DeleteCliente(ModelCliente modelCliente) {
		DataBase dbc = new DataBase();
		
		if(dbc.getConnection()!=null) {
			try {
				String query = "DELETE FROM Cliente WHERE dni=?";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setInt(1, modelCliente.getDni());
				st.executeUpdate();
				this.deleted = true;
				dbc.close();
				
			}catch(Exception e) {
				System.out.println("Error en la eliminacion");
			}
		}
	}

	public boolean isDeleted() {
		return deleted;
	}
	
	
	
}
