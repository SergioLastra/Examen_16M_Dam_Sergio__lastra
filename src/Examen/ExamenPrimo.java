package Examen;

import java.util.Scanner;

public class ExamenPrimo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Buenos d�as Ceinmark, soy Sergio Lastra");
		System.out.println("Introduce un n�mero para averiguar si es primo o no: ");
		
		int numero=s.nextInt();
		
		if(numero%2==0) {
			System.out.println("No es primo");
		}else {
			System.out.println("Es primo");
		}
		
	}

}
