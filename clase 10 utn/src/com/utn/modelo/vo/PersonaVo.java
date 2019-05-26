package com.utn.modelo.vo;

//

//Clase PersonaVo. 
//
// Al utilizar este tipo de clases, aplicamos el patr�n Value Object o VO
// (Anteriormente conocidas como DTO Data Transfer Object) en el que representamos las entidades (Tablas) 
// de la base de datos, la tabla persona tiene los campos id, nombre, edad, profesi�n , tel�fono  entonces
// nuestra clase Vo tendr� estos mismos atributos y de esta manera podremos transportar un objeto persona con 
// todos estos valores por medio de los m�todos set y get de cada atributo.
//
//Este patr�n nos facilita enormemente el transporte de la informaci�n, evitando que se env�en gran
//cantidad de par�metros a un m�todo cuando queremos hacer un registro o actualizaci�n, tambi�n en caso de 
//que se modifique la tabla de la BD, nuestra clase deber� ser modificada as� como los m�todos que obtienen la 
//informaci�n, mas no los m�todos que la transportan.

public class PersonaVo {



	private Integer idPersona;
	private String nombrePersona;
	private Integer edadPersona;
	private String profesionPersona;
	private Integer telefonoPersona;

	/**
	 * @return the idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona
	 *            the idPersona to set
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * @param nombrePersona
	 *            the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	/**
	 * @return the edadPersona
	 */
	public Integer getEdadPersona() {
		return edadPersona;
	}

	/**
	 * @param edadPersona
	 *            the edadPersona to set
	 */
	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	/**
	 * @return the profesionPersona
	 */
	public String getProfesionPersona() {
		return profesionPersona;
	}

	/**
	 * @param profesionPersona
	 *            the profesionPersona to set
	 */
	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	/**
	 * @return the telefonoPersona
	 */
	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	/**
	 * @param telefonoPersona
	 *            the telefonoPersona to set
	 */
	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	@Override
	public String toString() {
		return "PersonaVo [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona
				+ ", profesionPersona=" + profesionPersona + ", telefonoPersona=" + telefonoPersona + "]";
	}
}