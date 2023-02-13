import java.util.Scanner;
	/*Leia 4 valores inteiros A, B, C e D. A seguir,
	 *  se B for maior do que C
	 *  e se D for maior do que A,
	 *  e a soma de C com D
	 *  for maior que a soma de A e B 
	 *  e se C e D, ambos, forem positivos
	 *  e se a variável A for par 
	 *  escrever a mensagem 
	 *  "Valores aceitos", senão escrever "Valores nao
	 *      aceitos".

	Entrada
	Quatro números inteiros A, B, C e D.

	Saída
	Mostre a respectiva mensagem após a validação dos 
	valores.
	 
	 */

public class Mai {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		
		if (b > c && d > a && (c + d) > (a + b) &&
		   (a % 2 == 0) && c > 1 && d > 1 )
		{
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores não aceitos");
		}
		
	}

}
