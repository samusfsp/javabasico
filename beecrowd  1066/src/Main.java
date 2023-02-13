import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valores, par = 0, impar = 0, pos = 0,
			neg = 0, quant = 0;
		
		System.out.println("digite os valores");
		for(int conta = 1; conta < 6; conta++ ) {
			valores = teclado.nextInt();
			if (valores %  2 == 0) {
				par++;
			}else if(valores % 2 == 1 || valores % 2 == -1) {
				impar++ ;
			} if(valores > 0) {
				pos++;
			}else if(valores < 0) {
				neg++;
			}			
			
		}
		System.out.println(par +" numeros pares ");
		System.out.println(impar +" numeros impares ");
		System.out.println(pos +" numeros positivos");
		System.out.println(neg +" Numeros negativos");
		
	}

}
