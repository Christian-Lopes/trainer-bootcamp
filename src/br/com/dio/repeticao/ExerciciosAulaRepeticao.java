/**
 * @Curso Bootcampp DIO
 * @diciplina Arrays e estrutura de repetição
 * @professor Camila Calvacante
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author Christian Lopes de Oliveira 
 * 30 de mar de 2022
 * @execicio Sobre laços de repetição
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
		 * Faça um programa que leia conjuntos de dois valores, o primeiro representando
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
		 * Faça um exercício que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pendido até que o usuário informe um
		 * valor válido.
		 */
		Scanner scan = new Scanner(System.in);
		int nota;

		System.out.println("Nota: ");
		nota = scan.nextInt();

		while (nota < 0 | nota > 10) {
			System.out.println("Nota inválida. Informe outra.");
			nota = scan.nextInt();
			scan.close();
		}
	}

	public static void exercicioMaiorMedia() {
		/*
		 * Faça um programa que leia 5 números e informe o maior número e amédia desses
		 * números.
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
		System.out.println("Média: " + (soma / 5));
		scan.close();
	}
	
	public static void exercicioParImpar() {
		/*
		 * Faça um programa que peça N números inteiros, calcule e mostre a 
		 * quantidade de números pares e a quantidade de números impares.
		 */
		Scanner scan = new Scanner(System.in);
		int quantidadeNumeros;
		int numero;
		int quantidadePares = 0, quantidadeImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Números: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) quantidadePares++;
			else quantidadeImpares++;
			count++;
		} while (count < quantidadeNumeros);
		
		System.out.println("Pares: " + quantidadePares);
		System.out.println("Ímpares: " + quantidadeImpares);
		scan.close();
	}
	
	public static void exercicioTabuada() {
		/*
		 * Desenvolva um gerrador de tabuada, capaz de gerar a tabuada de qualquer
		 * número entre 1 a 10. O usuário deve informar de qual número ele deseja ver a
		 * tabuada. A saída deve ser conforme o exemplo dado:
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
		 * Faça um programa que calcule o fatorial de um número interiro 
		 * fornecido pelo usuário.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número: ");
		int fatorial = scan.nextInt();
		int total = 1;
		
		for(int i = fatorial; i >= 1; i--) {
			total *= i;
		}
		System.out.println("Fatorial de " + fatorial + "!: "  + total );
		scan.close();
	}
}
