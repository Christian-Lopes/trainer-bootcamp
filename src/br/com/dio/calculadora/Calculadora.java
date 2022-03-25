package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número: ");
		a = scan.nextInt();
		System.out.println("Informe segundo número: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
}
