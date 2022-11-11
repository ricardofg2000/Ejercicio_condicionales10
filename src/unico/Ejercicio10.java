package unico;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Escribe un programa que dada una hora 
		 * determinada (horas y minutos), calcule 
		 * los minutos que faltan para llegar a la medianoche.*/
		
		Scanner leer = new Scanner(System.in);
		int hora;
		int min;
		int min_restantes;
		int hora_restantes;
		
		System.out.println("Programa que calcula el tiempo que quedan hasta medianoche");
		System.out.print("Introduzca la hora");
		hora = leer.nextInt();
		System.out.print("Y ahora los minutos");
		min = leer.nextInt();
		
		hora_restantes = 23 - hora;
		min_restantes = hora_restantes * 60 + 60 - min;
		
		
		System.out.println("Quedan " + min_restantes + " minutos para medianoche");
		
		
		
		
		
	}

}