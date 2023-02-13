import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Caixa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n;
		double preco, total = 0.0;
		do {
			System.out.print("digite o preço: ");
			preco = teclado.nextDouble();
			total = total + preco;
		}while (preco > 0);
		System.out.println("***fim da compra***");
		System.out.println("total da compra: R$" + total );
		
	}

}
