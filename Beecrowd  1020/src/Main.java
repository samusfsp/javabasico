import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade, anos, meses, dias, restanos, restmeses;
		idade = teclado.nextInt();	
		
		anos = idade / 365;
		restanos = idade % 365;
		meses = restanos / 30;
		restmeses = restanos % 30;
		dias = restmeses;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		teclado.close();		
		
	}

}
