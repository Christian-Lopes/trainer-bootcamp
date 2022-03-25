package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Gato gato = new Gato("Romeu", "laranja", 4);
		Livro livro = new Livro();

		System.out.println(gato);

		// espaço em memória
		System.out.println(livro);

		System.out.println("O gato " + gato.getNome() + " tem " + gato.getIdade() + " anos de idade e sua cor é "
				+ gato.getCor() + ".");
	}

}

class Livro {
	public String nome;
	public Integer quantidade;
}

