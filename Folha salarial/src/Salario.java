import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		double horastrabalhadas;
		double valorhora;
		double salario;
		double inss;
		double percent;
		
		System.out.println("Digite o numero de horas trabalhadas:");
		horastrabalhadas = teclado.nextDouble();
		System.out.println("Digite o valor da hora em Reais:");
		valorhora = teclado.nextDouble();	
		salario = horastrabalhadas*valorhora;
		System.out.println("Seu salario bruto é: " + salario + " reais" );		
		System.out.println("digite o valor de desconto em %");
		percent = teclado.nextDouble();
		inss = salario * percent / 100 ;
		System.out.println("Seu salario liquido e de: "+(salario-inss) + " reais");
		
		
		
		
		
		

		
		
		
		
		
				
		
		

				
				
	}

}
