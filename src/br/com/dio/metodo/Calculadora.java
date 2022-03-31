package br.com.dio.metodo;

import java.util.Scanner;

/**
 * @Curso Bootcampp DIO
 * @diciplina Entendendo Métodos Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 24/03/2022
 * @execicio Calculadora
 */
public class Calculadora {

	public static void soma(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("Soma é igual a " + result);
	}

	public static void subtracao(int number1, int number2) {
		int result = number1 - number2;
		System.out.println("Subtração é igual a " + result);
	}

	public static void multiplicacao(int number1, int number2) {
		int result = number1 * number2;
		System.out.println("Multiplicação é igual a " + result);
	}

	public static void divisao(int number1, int number2) {
		int result = number1 / number2;
		System.out.println("Divisão é igual a " + result);
	}

	public static void calcular() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int a = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		int b = scan.nextInt();

		soma(a, b);
		subtracao(a, b);
		multiplicacao(a, b);
		divisao(a, b);
		scan.close();
	}

}
