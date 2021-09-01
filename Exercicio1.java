package Familia3201;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,maiornum=0;
		
		System.out.println("\nEscreva o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>maiornum);
		{
			maiornum = n1;
		}
		if(n2>maiornum);
		{
			maiornum = n2;
		}
		if(n3>maiornum);
		{
			maiornum = n3;
		}
		System.out.println("\nEscreva o maior número: "+maiornum);
	}

}
