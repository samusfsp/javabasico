import java.util.Scanner;

public class Conta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, kw, conta, desconto, kwtotal;
		
		System.out.println("Informe o salario: ");
		salario = teclado.nextDouble();
		System.out.println("Informe o Kw consumido: ");
		
		kwtotal = teclado.nextDouble();
		kw = salario / 700;
		conta = kw * kwtotal;
		


						
		
		
	}
	

}
