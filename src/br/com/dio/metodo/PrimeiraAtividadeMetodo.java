package br.com.dio.metodo;

/**
 * @Curso Bootcampp DIO
 * @diciplina Entendendo M�todos Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 24/03/2022
 * @execicio  Executar as atividades PrimeiraAtividadeMetodo
 */

public class PrimeiraAtividadeMetodo {

	public static void main(String[] args) {
		
		System.out.println("Exerc�cio do curso de Java-M�todos-> exerc�cio n�mero 01: Calculadora.");
		Calculadora.calcular();
		
		System.out.println("Exerc�cio do curso de Java-M�todos-> exerc�cio n�mero 02: Mensagem.");
		Mensagem.obterMensagem(1);
		Mensagem.obterMensagem(7);
		Mensagem.obterMensagem(14);
		
		System.out.println("Exerc�cio do curso de Java-M�todos-> exerc�cio n�mero 03: Empr�stimo.");
		Emprestimo.calcular(2000, 2);	
		Emprestimo.calcular(1500, 3);
		Emprestimo.calcular(5000, 4);
		Emprestimo.calcular(10000, Emprestimo.duasParcelas());
	}

}
