package br.com.dio.variavel.aula2;

/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 25/03/2022
 * @execicio Tipos de Variáveis
 */

public class Main {

	public static void main(String[] args) {

		byte b = 12;
		// byte b2 = 190; Valor ultrapassou o limite do tipo de dado

		short s = 20000;
		// short s2 = 200000; Valor ultrapassou o limite do tipo de dado

		int i = 1212121212;
		// int i1 = 12121212123; Valor ultrapassou o limite do tipo de dado

		long l = 1341234123421341234L;
		// long l1 = 1341234123421341234; Valor ultrapassou o limite do tipo de dado e
		// não foi adicionado a letra L gerando erro

		float f = 3.5f;
		// float f1= 3.5; Não foi add a letra L no final gerando um erro

		double d = 238.3d;
		double d1 = 238.3D;

		char c = 'T';
		// char c1 = 'Tu';
		char c2 = '\u0057';

		String st = "Christian";
		String st1 = "Railana";
		String st2 = "Nascimento 23/07/1990.";

		// String stData = "26/03/2022";

		boolean bo1 = true;
		boolean bo2 = false;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(bo1);
		System.out.println(bo2);

	}

}
