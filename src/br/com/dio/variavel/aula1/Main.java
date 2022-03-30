package br.com.dio.variavel.aula1;

/**
 * @Curso Bootcampp DIO
 * @diciplina Vari�vel em Java
 * @professor Thiago Leite
 * @author Christian Lopes de Oliveira
 * @date 25/03/2022
 * @execicio Vari�veis Num�ricas
 */

public class Main {

	public static void main(String[] args) {
		
		int i = 1;
		
		//int i; Vari�vel repedida causa erro
		
		//int 1a; Vari�vel iniciada com n�mero causa erro
		
		int _1a = 2; //Vari�vel com "_" no in�cio, n�o e uma boa pr�tica, deve ser evitada
		
		int $a =3; 	//Vari�vel com "$" no in�cio, n�o e uma boa pr�tica, deve ser evitado
		
		final int f = 10; 	//Constante que n�o segue padr�es de boas pr�ticas, deve ser em uppercase
		
		//f = 10; Constantes n�o pode ter seus valores alterados
		
		//int abs 121; No nome de vari�vel n�o e permitido espa�o, isso causar� um erro
		
		int safas$_134132 = 7; 		//N�o causa erro, mais n�o segue as boas pr�ticas
		
		//int premio%1212; Ocorre um erro quando coloca caracteres especiais no caso aqui o "%"
		
		int quantidadeProduto = 50; 	//Nota��o camelo, recomendado segundo a boa pr�ticas de codifica��o
		
		int QuantidadeProduto = 10;		//N�o ocorre erro, mais n�o segue as regras de boa pr�tica
		
		final int NUMERO_TENTATIVAS = 10;	//Constantes em uppercasse e separada com "_" e o correto conforme a boa pr�tica
		
		final int numeroTentativas = 10; 	//N�o ocorre erro, mais  as constante n�o recomenda a nota��o camelo
		
		int QUANTIDADE_OPCOES = 10; 	//Vari�veis devem seguir o padr�o anota��o camelo
		
		int qtdProd = 20;	//O nome n�o est� expressivo
		
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
