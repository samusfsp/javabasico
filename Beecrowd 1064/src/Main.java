import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double num = 0, media = 0;
		int positivos = 0;

		for (int n = 0; n <= 5; n++) {
			num = teclado.nextDouble();
			if (num >= 0) {
				positivos++;
				media += num;
			}
		}
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f\n", media / positivos);

	}

}
