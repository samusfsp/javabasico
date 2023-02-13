import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo, quantidade;
		double total;
		
		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		
		if(codigo == 1){
			total = 4.00 * quantidade;
			System.out.printf("Total: R$:%.2f",total);
		}else if(codigo == 2) {
			total = 4.50 * quantidade;
			System.out.printf("Total: R$:%.2f",total);
		}else if(codigo == 3) {
			total = 5.00 * quantidade;
			System.out.printf("Total: R$:%.2f",total);			
		}else if(codigo == 4) {
			total = 2.00 * quantidade;
			System.out.printf("pedido R$:%.2f",total);
		}else if(codigo == 5){
			total = 1.50 * quantidade;
			System.out.printf("Total: R$:%.2f",total);
		}else {
			System.out.println("pedido invalido, digite novamente ");
			}
		}
}
