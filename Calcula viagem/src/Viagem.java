import java.util.Scanner;

public class Viagem {
	// Calcular a quantidade de litros de combustível gastos em uma viagem, sabendo-se
	//que um carro faz, em média, 12 km/l. Deverão ser fornecidos o tempo gasto da viagem
	//e a velocidade média.
	// distancia = velocidade x tempo
	// litros utilizados - distancia / 12 

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double kmhora;
		double tempo;
		double distancia;
		double consumo;
		
		System.out.println("Digite a velocidade média  em km/h: ");
		kmhora = teclado.nextDouble();
		System.out.println("Digite o tempo gasto: ");
		tempo = teclado.nextDouble();
		distancia = kmhora * tempo;
		consumo = distancia / 12;		
		System.out.printf("A distancia percorrida foi de %.3f\n " , distancia);
		System.out.printf("O consumo de combustivel foi de: %.4f\n", consumo);

	}


}
