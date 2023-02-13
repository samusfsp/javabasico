import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horai, horaf, mini, minf;
		
		horai = teclado.nextInt();
		horaf = teclado.nextInt();
		mini = teclado.nextInt();
		minf = teclado.nextInt();
		
		horai = mini * 60;
		System.out.println("tempo " + horai);
		
		
	}
}
