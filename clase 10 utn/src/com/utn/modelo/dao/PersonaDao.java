package com.utn.modelo.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.utn.modelo.conexion.Conexion;

import com.utn.modelo.vo.PersonaVo;




/**
 * Clase que permite el acceso a la base de datos
 * @author Alex
 *
 */

//Cuando utilizamos estas clases, aplicamos el patr�n Data Access Object o DAO,
//b�sicamente este patr�n consiste en centralizar los procesos de acceso a la base de datos
//evitando inconsistencias y posibles problem�ticas cuando esto se realiza a lo largo de la aplicaci�n.
//Con este patr�n independizamos la l�gica de negocio de la l�gica de acceso a datos obteniendo mayor 
//organizaci�n y flexibilidad en el sistema.

public class PersonaDao
{

	public void registrarPersona(PersonaVo miPersona)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('"+miPersona.getIdPersona()+"', '"
					+miPersona.getNombrePersona()+"', '"+miPersona.getEdadPersona()+"', '"
					+miPersona.getProfesionPersona()+"', '"+miPersona.getTelefonoPersona()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

	public PersonaVo buscarPersona(int codigo) 
	{
		Conexion conex= new Conexion();
		PersonaVo persona= new PersonaVo();
		boolean existe=false;
		try {
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			 }
			res.close();
			conex.desconectar();
					
					
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return persona;
			}
			else return null;				
	}


	public void eliminarPersona(int i)
	{
		Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='"+i+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

}