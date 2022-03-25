package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Gato gato = new Gato("Romeu", "laranja", 4);
		Livro livro = new Livro();

		System.out.println(gato);

		// espa�o em mem�ria
		System.out.println(livro);

		System.out.println("O gato " + gato.getNome() + " tem " + gato.getIdade() + " anos de idade e sua cor � "
				+ gato.getCor() + ".");
	}

}

class Livro {
	public String nome;
	public Integer quantidade;
}

