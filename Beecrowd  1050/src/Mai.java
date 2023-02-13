import java.util.Scanner;

public class Mai {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codigo;

		codigo = teclado.nextInt();
		if(codigo == 61){
			System.out.println("Brasilia");
		}else if(codigo == 71){
			System.out.println("Salvador");
		}else if(codigo == 11) {
			System.out.println("Sao Paulo");
		}else if(codigo == 21) {
			System.out.println("Rio de janeiro");
		}else if(codigo == 32) {
			System.out.println("Juiz de fora");
		}else if(codigo == 19) {
			System.out.println("Campinas");
		}else if(codigo == 27) {
			System.out.println("Vitoria");
		}else if(codigo == 31) {
			System.out.println("Belo horizote");
		}else {
			System.out.println("DDD nao cadastrado");
		}
		
		
		
	}

}
