/**
 * @Curso Bootcampp DIO
 * @diciplina Arrays e estrutura de repeti��o
 * @professor(a) Camila Calvacante
 */
package br.com.dio.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Christian Lopes de Oliveira
 * 31 de mar de 2022
 * @execicio Arrays
 */
public class Arrays {

	public static void main(String[] args) {

		//ordemInversa();
		//consoantes();
		//numerosAleatorios();
		arrayMultidimensional();
	}
	
	public static void ordemInversa() {
		/*
		 * Crie um vetor de 6 n�meros inteiros e mostre-os na ordem inversa.
		 */
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		//Mostra o endere�o de mem�ria
		System.out.println(vetor);
		
		int count = 0;
		System.out.println("Vetor normal.");
		while (count < (vetor.length)) {
			System.out.println(vetor[count] + " ");
			count++;			
		}
		
		System.out.println("Array com n�meros invertidos.");
		for(int i = (vetor.length -1); i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}
	}

	public static void consoantes() {
		/*
		 * Fa�a um programa que leia um vetor de 6 caracteres, e diga quantas consoantes
		 * foram lidas. Imprima as consoantes.
		 */
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		int count = 0;
		do {
			System.out.println("Letras: ");
			String letra = scan.next();
			
			if( !(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u") )) {
				consoantes[count] = letra;
			}
			count++;
			
		} while (count < consoantes.length);
		
		for (String consoante : consoantes) {
			if (consoante != null) {
				System.out.print(consoante + " ");
				quantidadeConsoantes++;
			}
		}
		System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
		scan.close();
	}

	public static void numerosAleatorios() {
		/*
		 * Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100)
		 * armazene-os num vetor. Ao final mostre os n�meros e seus sucessores.
		 */
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length;i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		System.out.println("N�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessores dos n�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		
		System.out.println("\nAntecessores dos n�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero-1) + " ");
		}
	}

	public static void arrayMultidimensional() {
		Random random = new Random();
		
		int[][] M = new int[4][4];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length;j++) {
				M[i][j] = random.nextInt(9);
			}
		}
		
		for (int[] linha  : M) {
			for (int coluna  : linha) {
				System.out.print(coluna);
			}
			System.out.print("\n");
		}
	}
}
















