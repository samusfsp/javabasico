import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inicio, fim, duracao;
		
		inicio = teclado.nextInt();
		fim = teclado.nextInt();
		duracao = (fim - inicio);
		System.out.println("O JOGO DUROU: " + duracao + " HORAS");
		
		
	}

}
