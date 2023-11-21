package Controladores;

import java.util.Scanner;

import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;


public class inicio {

	public static void main(String[] args) {
		
		operativaInterfaz oi=new operativaImplementacion();
		int num=-1;
		int numOportunidad=1;
		int numAleatorio;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Generaremos un número aleatorio para que lo acierte");
		numAleatorio=(int)oi.numeroAleatorio();
		
		System.out.println("A continuacion, tiene 10 oportunidades para acertar el número.");
		
		while(numOportunidad<=10||num==numAleatorio) {
			
			System.out.println("Introduzca el número para acertar: ");
			num=sc.nextInt();
			
			if(num==numAleatorio) {
				System.out.println("Enhorabuena!! has acertado el número: "+numAleatorio+". En la oportunidad: "+numOportunidad);
				break;
			}
			
			else if(num>numAleatorio) {
				
				System.out.println("Ha sobrepasado el número aleatorio.Lleva "+numOportunidad+" oportunidades");
			}
			
			else {
				
				System.out.println("El número es mas pequeño que el número aleatorio.Lleva "+numOportunidad+" oportunidades\"");
			}
			
			numOportunidad++;
		}
		
		System.out.println("Lo sentimos ha alcanzado el número de oportunidades. El número aleatorio era: "
				+numAleatorio);
		
		
		

	}

}
