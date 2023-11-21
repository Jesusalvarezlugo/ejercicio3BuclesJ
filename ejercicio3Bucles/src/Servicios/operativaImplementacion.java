package Servicios;

import java.util.Scanner;

public class operativaImplementacion implements operativaInterfaz {

	@Override
	public int pedirNumero(Scanner sc) {
		
		int num;
		System.out.println("Introduzca el número para adivinar el aleatorio: ");
		num=sc.nextInt();
		return num;
	}

	@Override
	public double numeroAleatorio() {
		
		double numAleatorio;
		numAleatorio=Math.random()*100;
		return numAleatorio;
	}

}
