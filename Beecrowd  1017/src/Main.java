import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tempog, velmedia, consumo;
		double litros, distancia, calculo;
		
		tempog = teclado.nextInt();
		velmedia = teclado.nextInt();
		consumo = 12;	
		distancia = (velmedia * tempog);
		calculo = distancia / consumo;
		System.out.printf("consumo %.3f ",  calculo);
		

		
		
		
		
		
	}

}
