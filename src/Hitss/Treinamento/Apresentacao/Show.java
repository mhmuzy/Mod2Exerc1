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
			System.out.println("Digite o 1º Número:");
			System.out.println("");
			n1 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 2º Número:");
			System.out.println("");
			n2 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 3º Número:");
			System.out.println("");
			n3 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 4º Número:");
			System.out.println("");
			n4 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 5º Número:");
			System.out.println("");
			n5 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 6º Número:");
			System.out.println("");
			n6 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 7º Número:");
			System.out.println("");
			n7 = teclado.nextInt();
			System.out.println("Digite o 8º Número:");
			System.out.println("");
			n8 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 9º Número:");
			System.out.println("");
			n9 = teclado.nextInt();
			System.out.println("");
			n10 = teclado.nextInt();
			System.out.println("");
			m = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
			System.out.println("A soma dos 10 números dá : " + m);
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
