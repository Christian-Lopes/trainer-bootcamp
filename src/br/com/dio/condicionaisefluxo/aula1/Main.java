/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * 30 de mar de 2022
 * @execicio Lógica Condicionais e Controle de Fluxo
 */
package br.com.dio.condicionaisefluxo.aula1;

public class Main {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 20;
		float f1 = 2.5f;
		float f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'c';
		char c2 = 'a';
		String s1 = "Fulano";
		String s2 = "Fulano";
		String s3 = "Cicrano";
		boolean b1 = true;
		boolean b2 = false;

		long l1 = 1597L;
		long l2 = 8997L;
		byte y1 = 1;
		short h1 = 25;

		System.out.println("Números inteiros.");
		System.out.println("i1 == i2: " + (i1 == i2));
		System.out.println("i1 != i2: " + (i1 != i2));
		System.out.println("i1 > i2: " + (i1 > i2));
		System.out.println("i1 <= i2: " + (i1 <= i2));

		System.out.println("Números quebrados.");
		System.out.println("f1 == f2: " + (f1 == f2));
		System.out.println("f1 != f2: " + (f1 != f2));
		System.out.println("f1 >= f2: " + (f1 >= f2));
		System.out.println("f1 < f2: " + (f1 < f2));

		System.out.println("Caracteres.");
		System.out.println("c1 == c2: " + (c1 == c2));
		System.out.println("c1 != c2: " + (c1 != c2));
		// Verifica a ordem alfabética
		System.out.println("c1 > c2: " + (c1 > c2));
		System.out.println("c1 <= c2: " + (c1 <= c2));

		System.out.println("Boolean.");
		System.out.println("b1 == b2: " + (b1 == b2));
		System.out.println("b1 != b2: " + (b1 != b2));
		//Tipos Boolean não comparação de maior ou menor
		// System.out.println("b1 > b2: " + (b1 > b2));
		// System.out.println("b1 <= b2: " + (b1 <= b2));

		System.out.println("Strings.");
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 != s2: " + (s1 != s2));
		// String não aceita operadores relacionais de maior ou menor
		// System.out.println("s1 >= s2: " + (s1 >= s2));
		// System.out.println("s1 < s2: " + (s1 < s2));

		System.out.println("Números dos mais váriados tipos, " + 
		"\nStrings não pode ser comparados com números.");
		System.out.println("i2 > f1: " + (i2 > f1));
		System.out.println("d1 == h1: " + (d1 == h1));
		// String não pode ser comparados
		// System.out.println("s2 != c1: " + (s2 != c1));
		// System.out.println("b1 < b2: " + (s3 < i1));

		System.out.println("l1 == i2: " + (l1 == i2));
		System.out.println("l2 >= i1: " + (l2 >= i1));
		System.out.println("y1 != h1: " + (y1 != h1));

	}

}
