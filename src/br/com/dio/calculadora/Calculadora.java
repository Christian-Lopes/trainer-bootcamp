package br.com.dio.calculadora;

/**
 * @Curso Bootcampp DIO
 * @diciplina Entendendo M�todos Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 24/03/2022
 * @execicio Calculadora
 */

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Informe segundo n�mero: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Divis�o: " + divisao);
		System.out.println("Multiplica��o: " + multiplicacao);
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
	public static double divisao(int a, int b) {
		return a / b;
	}
}
