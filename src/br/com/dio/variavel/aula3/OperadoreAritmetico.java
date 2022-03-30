package br.com.dio.variavel.aula3;

/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 25/03/2022
 * @execicio Operadores Aritmético
 */

public class OperadoreAritmetico {

	public static void main(String[] args) {
		margin("Pré - Pró");
		prePos();
		margin("Aritmética");
		aritmetico();
		margin("Atribuição");
		atribuicao();
		margin("Precedência");
		precedencia();
		

	}
	public static void margin(String tema) {
		System.out.println("********************************* " + tema + " *********************************************8");
	}

	public static void prePos() { 
		int k = 10;

		int i = ++k;
		int j = k--;
		int x = k;

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("x: " + x);
	}

	public static void aritmetico() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a + b;
		int r2 = c - a;
		int r3 = d * b;
		int r4 = e / a;
		int r5 = c % b;
		
		System.out.println("a + b = " + r1);
		System.out.println("c - a = " + r2);
		System.out.println("d x b = " + r3);
		System.out.println("e / a = " + r4);
		System.out.println("c % b = " + r5);
	}
	
	public static void atribuicao() {
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5f;
		double d = f;
		
		System.out.println("d = " + d + ". Variável d recebendo um valor do tipo float!");
		
		i += 5;
		j -= 3;
		d /= 2.7d;
		l *= 3;
		k /= 2;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("d = " + d);
		System.out.println("l = " + l);
		System.out.println("k = " + k);
		
		i = k = j;
		
		System.out.println("i = " + i);
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	public static void precedencia() {
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k;
		
		System.out.println("i++ + --j: " + a);
		System.out.println("i: " + i);
		
		int b = k / --i % 3 + 1;
		
		System.out.println("k / --i % 3 + 1: " + b);
		System.out.println("i: " + i);
		
		int c = 2;
		
		c *= i += 5;
		
		System.out.println("c *= i += 5: " + c);
	}
}

