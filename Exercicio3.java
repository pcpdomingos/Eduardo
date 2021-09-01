package Familia3201;
import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nEscreva sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Categoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria adulta");
		}
		else
		{
			System.out.println("Você não se encaixa nas categorias");
		}
	}

}
