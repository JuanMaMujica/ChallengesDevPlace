package com.dia12.ciudades.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.dia12.ciudades.db.Coneccion;
import com.dia12.ciudades.models.CiudadModel;

@Service
public class CiudadService {
		private Connection dbc;
	
	public CiudadService() {
		dbc = new Coneccion().getConnection();
	}
	
	public void insertCiudad(CiudadModel ciudad) throws SQLException {
		String query = "INSERT INTO ciudades (id,nombre,poblacion,provincia) VALUES (?,?,?,?)";
		PreparedStatement st = dbc.prepareStatement(query);
		st.setInt(1, ciudad.getId());
		st.setString(2, ciudad.getNombre());
		st.setInt(3, ciudad.getPoblacion());
		st.setString(4, ciudad.getProvincia());
		st.executeUpdate();
		dbc.close();
	}
	
	public CiudadModel selectCiudad(int id) throws SQLException {
		String query = "SELECT * FROM ciudades WHERE id=?";
		PreparedStatement st = dbc.prepareStatement(query);
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
        CiudadModel ciudad = new CiudadModel(
                rs.getInt(1),
                rs.getString(2),
                rs.getInt(3),
                rs.getString(4));
        dbc.close();
        return ciudad;
	}
	
}
