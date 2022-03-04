package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Jose Antonio Castillejo Lobato
 * @version 1.1
 */
public class Utils {
	/**
	 * Método para introducir la hora actual del sistema
	 * @return dtf.format(LocalDateTime.now());
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Método para introducir la fecha actual del sistema
	 * @return dtf.format(LocalDteTime.now());
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Método para calcular el precio del alquiler según los dias que se introduzcán
	 * @param dias
	 * @return result
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * 50 * 1.21f;
		return result;
	}
	/**
	 * Método para calcular el precio del alquiler según los meses que se introduzcán
	 * @param meses
	 * @return meses*750*1.21f
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * 750 * 1.21f;
	}

}
