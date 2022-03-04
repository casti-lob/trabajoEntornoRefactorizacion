package com.test.refactoring.business;
/**
 * 
 * @author Jose Antonio Castillejo Lobato
 * @version 1.1
 */
public class Camion {

	private String matricula;
	private String color;
	private String combustible;
	private String tipoCarnet;
	private String nombre_conductor;
	private String dniConductor;
	/**
	 * Constructor de la clase que hereda
	 */
	public Camion() {
		super();
	}
	/**
	 *  Constructor con los siguientes parametros de entrada
	 * @param matricula 
	 * @param color
	 * @param combustible
	 * @param tipoCarnet
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombre_conductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.tipoCarnet = tipoCarnet;
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
	 * Metodo para obtener el tipo de carnet
	 * @return combustible
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	/**
	 * Metodo para cambiar el tipo de carnet del vehiculo
	 * @param tipoCarnet
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
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
	 * Metodo que se le da la velocidad y lo incrementa
	 * @param velocidad
	 */
	public void Acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	/**
	 * Metodo para detener el vehiculo
	 */
	public void Detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}
	
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}
	
}
