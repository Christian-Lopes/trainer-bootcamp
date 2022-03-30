package br.com.dio.metodo.aula1;

/**
 * @Curso Bootcampp DIO
 * @diciplina Entendendo Métodos Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 24/03/2022
 * @execicio Empréstimo
 */

public class Emprestimo {
	
	public static int duasParcelas() {
		return 2;
	}
	
	public static int tresParcelas() {
		return 3;
	}
	
	public static double taxaDuascaoParcela() {
		return 0.3;
	}
	
	public static double taxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * taxaDuascaoParcela());
			System.out.println("Valor total para opção de duas parcelas: " + valorFinal);
		}else if(parcelas == 3) {
			double valorFinal = valor + (valor * taxaTresParcelas());
			System.out.println("Valor total para opção de três parcelas: " + valorFinal);
		}else {
			System.out.println("Opção de parcelas inválida!");
		}
	}
}
