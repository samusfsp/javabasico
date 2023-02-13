import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double salario, reajuste;
		int percent;
		
		salario = teclado.nextDouble();
		
		if(salario <= 400.00) 
		{
			percent = 15;
	   	 	reajuste = salario * 0.15;
	   	 	System.out.printf("Novo salario: %.2f\n",
			reajuste + salario);
		 	System.out.printf("Reajuste ganho: %.2f\n",
			reajuste);
		 	System.out.println("Em percentual: " + percent + "%");
		}else if(salario >= 400.01 && salario <= 800.00) 
		{
			 
			 percent = 12;
		 	 reajuste = salario * 0.12;
	     	 System.out.printf("Novo salario: %.2f\n",
	    	 reajuste + salario);
		 	 System.out.printf("Reajuste ganho: %.2f\n",
			 reajuste);
		 	 System.out.println("Em percentual: " + percent + "%");
		}else if(salario >= 800.01 && salario <= 1200.00)
		{
			 percent = 10;
			 reajuste = salario * 0.10;
		     System.out.printf("Novo salario: %.2f\n",
			 reajuste + salario);
			 System.out.printf("Reajuste ganho: %.2f\n",
			 reajuste);
			 System.out.println("Em percentual: " + percent + "%");
		}else if(salario >= 1200.01 && salario <= 2000.00 )
		{
			 percent = 7;
			 reajuste = salario * 0.07;
		     System.out.printf("Novo salario: %.2f\n",
			 reajuste + salario);
			 System.out.printf("Reajuste ganho: %.2f\n",
			 reajuste);
			 System.out.println("Em percentual: " + percent + "%");
			
		}else if(salario > 2000.00)
		{
			 percent = 4;
			 reajuste = salario * 0.04;
		     System.out.printf("Novo salario: %.2f\n",
			 reajuste + salario);
			 System.out.printf("Reajuste ganho: %.2f\n",
			 reajuste);
			 System.out.println("Em percentual: " + percent + "%");
			
		}		
	}
}
