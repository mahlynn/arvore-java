package br.com.residencia.poo.arvore;

import java.util.Scanner;

public class Arvore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tamanho;
		
		System.out.println("Tamanho da árvore: ");
		tamanho = sc.nextInt();
		
		for(int i = 0; i < tamanho; i++) {
			for(int j = i; j < tamanho; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < i; j++) {
				System.out.print("**");
			}
			System.out.print("\n");
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < tamanho - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("****\n");
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < tamanho - 3; j++) {
				System.out.print(" ");
			}
			System.out.print("********\n");
		}
		
		System.out.println("\n> Aqui está sua árvore de tamanho "+ tamanho +"! :)");
		
		sc.close();
	}

}
