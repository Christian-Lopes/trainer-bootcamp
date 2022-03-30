package br.com.dio.variavel.aula4;
/**
 * @Curso Bootcampp DIO
 * @diciplina Vari�vel em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 25/03/2022
 * @execicio Casting 
 */
public class Casting {

	public static void main(String[] args) {
		
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1;
		System.out.println("Houve a perda de informa��o: b1 = " + b1);
		
		long l1;
		int i1 = 10;
		l1 = i1;
		System.out.println("N�o houver a perda de informa��o: l1 = " + l1);
		
		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2;
		System.out.println("Houve a perda de informa��o: i2 = " + i2);
		
		int i3;
		long l3 = 10000L;
		i3 = (int) l3;
		System.out.println("N�o houver a perda de informa��o: i3 = " + i3);
		
		double d1;
		float f1 = 10.5f;
		d1 = f1;
		System.out.println("Houve a perda de informa��o: d1 = " + d1);
		
		float f2;
		float f3;
		double d2 = 10000.58d;
		f2 = (float) d2;
		double d3 = 10000.9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d;
		f3 = (float) d3;
		System.out.println("N�o houve a perda de informa��o: f2 = " + f2);
		System.out.println("Houve a perda de informa��o: f3 = " + f3);
		
		int i4;
		float f4 = 11.5673f;
		i4 = (int) f4;
		System.out.println("Truncar informa��es: i4 = " + i4);
		
		b1 = (byte) d3;
		System.out.println("N�o houve a perda de informa��o: b2 = " + b1);
	}

	
}
