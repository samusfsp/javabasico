import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		do {
			System.out.println("digite um numero ");
			numero = teclado.nextInt();
			System.out.println("digitado " + numero);
		   }
		while(numero != -1);
	}

}
