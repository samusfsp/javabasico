import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		double y, total;
		
		x = teclado.nextInt();
		y = teclado.nextDouble();
		total = x / y;
		
		System.out.printf("%.3f km/l\n", total);
		teclado.close();
		
	}

}
