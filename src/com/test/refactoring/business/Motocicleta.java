package com.test.refactoring.business;
/**
 * 
 * @author Jose Antonio Castillejo Lobato
 * @version 1.1
 */
public class Motocicleta {
	
	private String matricula;
	private String color;
	private String combustible;
	private Integer cilindrada;
	private String nombre_conductor;
	private String dniConductor;
	/**
	 * Constructor con los siguientes parametros de entrada
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param cilindrada
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombre_conductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.nombre_conductor = nombre_conductor;
		this.dniConductor = dniConductor;
	}
	/**
	 * Metodo para obtener la matricula
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Metodo para cambiar la matricula
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * Metodo para obtener color
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Metodo para cambiar el color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Metodo para obtener el combustible
	 * @return combustible
	 */
	public String getCombustible() {
		return combustible;
	}
	/**
	 * Metodo para modificar el combustible
	 * @return combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	/**
	 * Metodo para obtener la cilindrada
	 * @return cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}
	/**
	 * Metodo para cambiar la cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**
	 * Metodo para obtener el nombre del conductor del vehiculo
	 * @return nombre_conductor
	 */
	public String getNombre_conductor() {
		return nombre_conductor;
	}
	/**
	 * Metodo que recibe el nombre del nuevo conductor y lo modifica
	 * @param nombre_conductor
	 */
	public void setNombre_conductor(String nombre_conductor) {
		this.nombre_conductor = nombre_conductor;
	}
	/**
	 * Metodo para obtener el dni del conductor
	 * @return dniConductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}
	/**
	 * Metodo para cambiar al dni del conductor
	 * @param dniConductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	/**
	 * Metodo por hacer que se le da una velocidad y la añade
	 * @param velocidad
	 */
	public void Acelerar(Integer velocidad) {
		//TO DO
	}
	/**
	 * Metodo por hacer para detener el vehiculo
	 */
	public void Detener() {
		//TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + nombre_conductor + ", dniConductor="
				+ dniConductor + "]";
	}	

}
