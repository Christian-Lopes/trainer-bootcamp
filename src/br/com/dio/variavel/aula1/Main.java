package br.com.dio.variavel.aula1;

/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 25/03/2022
 * @execicio Variáveis Numéricas
 */

public class Main {

	public static void main(String[] args) {
		
		int i = 1;
		
		//int i; Variável repedida causa erro
		
		//int 1a; Variável iniciada com número causa erro
		
		int _1a = 2; //Variável com "_" no início, não e uma boa prática, deve ser evitada
		
		int $a =3; 	//Variável com "$" no início, não e uma boa prática, deve ser evitado
		
		final int f = 10; 	//Constante que não segue padrões de boas práticas, deve ser em uppercase
		
		//f = 10; Constantes não pode ter seus valores alterados
		
		//int abs 121; No nome de variável não e permitido espaço, isso causará um erro
		
		int safas$_134132 = 7; 		//Não causa erro, mais não segue as boas práticas
		
		//int premio%1212; Ocorre um erro quando coloca caracteres especiais no caso aqui o "%"
		
		int quantidadeProduto = 50; 	//Notação camelo, recomendado segundo a boa práticas de codificação
		
		int QuantidadeProduto = 10;		//Não ocorre erro, mais não segue as regras de boa prática
		
		final int NUMERO_TENTATIVAS = 10;	//Constantes em uppercasse e separada com "_" e o correto conforme a boa prática
		
		final int numeroTentativas = 10; 	//Não ocorre erro, mais  as constante não recomenda a notação camelo
		
		int QUANTIDADE_OPCOES = 10; 	//Variáveis devem seguir o padrão anotação camelo
		
		int qtdProd = 20;	//O nome não está expressivo
		
		System.out.println(i);
		System.out.println(_1a);
		System.out.println($a);
		System.out.println(f);
		System.out.println(safas$_134132);
		System.out.println(quantidadeProduto);
		System.out.println(QuantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(numeroTentativas);
		System.out.println(QUANTIDADE_OPCOES);
		System.out.println(qtdProd);
		
	}

}
