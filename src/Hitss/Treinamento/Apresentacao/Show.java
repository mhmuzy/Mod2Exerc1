package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			System.out.println("");
			System.out.println("       Hitss Treinamento");
			System.out.println("");
			int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, m;
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o 1� N�mero:");
			System.out.println("");
			n1 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 2� N�mero:");
			System.out.println("");
			n2 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 3� N�mero:");
			System.out.println("");
			n3 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 4� N�mero:");
			System.out.println("");
			n4 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 5� N�mero:");
			System.out.println("");
			n5 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 6� N�mero:");
			System.out.println("");
			n6 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 7� N�mero:");
			System.out.println("");
			n7 = teclado.nextInt();
			System.out.println("Digite o 8� N�mero:");
			System.out.println("");
			n8 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 9� N�mero:");
			System.out.println("");
			n9 = teclado.nextInt();
			System.out.println("");
			n10 = teclado.nextInt();
			System.out.println("");
			m = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
			System.out.println("A soma dos 10 n�meros d� : " + m);
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
