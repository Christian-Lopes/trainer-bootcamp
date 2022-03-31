package br.com.dio.metodo;

import java.util.Scanner;

/**
 * @Curso Bootcampp DIO
 * @diciplina Entendendo M�todos Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 24/03/2022
 * @execicio Calculadora
 */
public class Calculadora {

	public static void soma(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("Soma � igual a " + result);
	}

	public static void subtracao(int number1, int number2) {
		int result = number1 - number2;
		System.out.println("Subtra��o � igual a " + result);
	}

	public static void multiplicacao(int number1, int number2) {
		int result = number1 * number2;
		System.out.println("Multiplica��o � igual a " + result);
	}

	public static void divisao(int number1, int number2) {
		int result = number1 / number2;
		System.out.println("Divis�o � igual a " + result);
	}

	public static void calcular() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero: ");
		int a = scan.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int b = scan.nextInt();

		soma(a, b);
		subtracao(a, b);
		multiplicacao(a, b);
		divisao(a, b);
		scan.close();
	}

}
