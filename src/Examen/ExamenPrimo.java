package Examen;

import java.util.Scanner;

public class ExamenPrimo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Buenos días Ceinmark, soy Sergio Lastra");
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		
		int numero=s.nextInt();
		
		if(numero%2==0) {
			System.out.println("No es primo");
			while(numero!=0) {
				numero=numero/2;
				System.out.println(numero);
			}
		}else {
			System.out.println("Es primo");
			while(numero!=1) {
				numero=numero/2;
				System.out.println(numero);
			}
		}
		
	}

}
