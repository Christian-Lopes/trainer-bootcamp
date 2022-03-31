/**
 * @Curso Bootcampp DIO
 * @diciplina Arrays e estrutura de repeti��o
 * @professor Camila Calvacante
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author Christian Lopes de Oliveira 
 * 30 de mar de 2022
 * @execicio Sobre la�os de repeti��o
 */
public class ExerciciosAulaRepeticao {
	public static void main(String[] args) {
		// exercicioNomeIdade();
		// exercicioNota();
		//exercicioMaiorMedia();
		//exercicioParImpar();
		//exercicioTabuada();
		exercicioFatorial();
	}

	public static void exercicioNomeIdade() {

		/*
		 * Fa�a um programa que leia conjuntos de dois valores, o primeiro representando
		 * o nome do aluno e o segundo representando a sua idade.
		 */
		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Nome: ");
			nome = scan.next();
			if (nome.equals("0"))
				break;
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}
		scan.close();
	}

	public static void exercicioNota() {
		/*
		 * Fa�a um exerc�cio que pe�a uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inv�lido e continue pendido at� que o usu�rio informe um
		 * valor v�lido.
		 */
		Scanner scan = new Scanner(System.in);
		int nota;

		System.out.println("Nota: ");
		nota = scan.nextInt();

		while (nota < 0 | nota > 10) {
			System.out.println("Nota inv�lida. Informe outra.");
			nota = scan.nextInt();
			scan.close();
		}
	}

	public static void exercicioMaiorMedia() {
		/*
		 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero e am�dia desses
		 * n�meros.
		 */
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		int count = 0; 
		int soma = 0;
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			soma += numero;
			if(numero > maior) maior = numero;
			count++;
		} while(count < 5);
		System.out.println("Maior: " + maior);
		System.out.println("M�dia: " + (soma / 5));
		scan.close();
	}
	
	public static void exercicioParImpar() {
		/*
		 * Fa�a um programa que pe�a N n�meros inteiros, calcule e mostre a 
		 * quantidade de n�meros pares e a quantidade de n�meros impares.
		 */
		Scanner scan = new Scanner(System.in);
		int quantidadeNumeros;
		int numero;
		int quantidadePares = 0, quantidadeImpares = 0;
		
		System.out.println("Quantidade de n�meros: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("N�meros: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) quantidadePares++;
			else quantidadeImpares++;
			count++;
		} while (count < quantidadeNumeros);
		
		System.out.println("Pares: " + quantidadePares);
		System.out.println("�mpares: " + quantidadeImpares);
		scan.close();
	}
	
	public static void exercicioTabuada() {
		/*
		 * Desenvolva um gerrador de tabuada, capaz de gerar a tabuada de qualquer
		 * n�mero entre 1 a 10. O usu�rio deve informar de qual n�mero ele deseja ver a
		 * tabuada. A sa�da deve ser conforme o exemplo dado:
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		scan.close();
	}
	
	public static void exercicioFatorial() {
		/*
		 * Fa�a um programa que calcule o fatorial de um n�mero interiro 
		 * fornecido pelo usu�rio.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N�mero: ");
		int fatorial = scan.nextInt();
		int total = 1;
		
		for(int i = fatorial; i >= 1; i--) {
			total *= i;
		}
		System.out.println("Fatorial de " + fatorial + "!: "  + total );
		scan.close();
	}
}
