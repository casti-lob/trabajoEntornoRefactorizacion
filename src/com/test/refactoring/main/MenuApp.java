package com.test.refactoring.main;

import java.util.Random;
import java.util.Scanner;

import com.test.refactoring.business.Camion;
import com.test.refactoring.business.Coche;
import com.test.refactoring.utils.Utils;
/**
 * 
 * @author estudiante
 *	@version 1.1
 */
public class MenuApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		mostrarPresentacion();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		
		inicioPrograma(nombre, primerApellido);
		
		Coche[] listaCoches = nCoches(sc);
		
		Camion[] listaCamiones = nCamiones(sc);
		
		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);
		
		sc.close();
		
	}
	/**
	 * Método que tiene como parámetro de entrada el nombre y primer apellido, y muestra la fecha ,
	 *  hora y un saludo con el numbre del usuario
	 * @param nombre
	 * @param primerApellido
	 */
	public static void inicioPrograma(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * Método que tiene como parámetro de entrada el número de camiones y nos muestra el número, la lista de camiones y su aceleración 
	 * @param sc
	 * @return listaCamiones
	 */
	private static Camion[] nCamiones(Scanner sc) {
		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones= sc.nextInt();
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].Acelerar(20);
		}
		return listaCamiones;
	}
	/**
	 * Método que tiene como parámetro de entrada el número de coche y nos muestra el número, la lista de camiones y su aceleración 
	 * @param sc
	 * @return listaCoches
	 */
	private static Coche[] nCoches(Scanner sc) {
		System.out.println("Introduce el n�mero de coches : ");
		int numCoches= sc.nextInt();
		Coche[] listaCoches = new Coche[numCoches];
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].Acelerar(20);
		}
		return listaCoches;
	}
	/**
	 * Muestra la presentación del programa
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * Metodo para detener a todos los coches
	 * @param listaCoches 
	 * 
	 */
	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].Detener();
		}
	}
	/**
	 * Método para detener a todos los camiones
	 * @param listaCamiones
	 */
	private static void detenerVehiculos(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].Detener();
		}
	}
	
	
}
