package com.test.refactoring.business;
/**
 * 
 * @author Jose Antonio Castillejo Lobato
 * @version 1.1
 *
 */
public class Coche {
	
	private static final int VELOCIDADMAXIMA = 120;
	private String matricula;
	private String color;
	private String combustible;
	private Integer numPlazas;
	private String nombre_conductor;
	private String dniConductor;
	/**
	 * Constructor de la clase que hereda
	 */
	public Coche() {
		super();
	}
	/**
	 * Constructor con los siguientes parametros de entrada
	 * @param matricula
	 * @param color
	 * @param combustrible
	 * @param numPlazas
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Coche(String matricula, String color, String combustrible, Integer numPlazas, String nombre_conductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustrible;
		this.numPlazas =  numPlazas;
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
	 * Metodo para obtener el numero de plazas
	 * @return numPlazas
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
	/**
	 * Método para cambiar el número de plázas
	 * @param numPlazas
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
	/**
	 * Método para obtener el nombre
	 * @return nombre_conductor
	 */
	public String getNombre_conductor() {
		return nombre_conductor;
	}
	/**
	 * Método para cambiar el nombre del conductor
	 * @param nombre_conductor 
	 */
	public void setNombre_conductor(String nombre_conductor) {
		this.nombre_conductor = nombre_conductor;
	}
	/**
	 * Método para obtener el dni del conductor
	 * @return
	 */
	public String getDniConductor() {
		return dniConductor;
	}
	/**
	 * Método para cambiar el dni del conductor
	 * @param dniConductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	/**
	 * Método al que se le ingresa una velocidad y se le incrementa la velocidad
	 * @param velocidad
	 */
	public void Acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < VELOCIDADMAXIMA) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	/**
	 * Método para detener el vehículo
	 */
	public void Detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}

}
