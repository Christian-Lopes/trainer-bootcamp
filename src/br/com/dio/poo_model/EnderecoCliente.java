/**
 * @Curso Bootcampp DIO
 * @diciplina Orientação a Objeto
 * @professor(a) Rodrigo Tavares
 */
package br.com.dio.poo_model;

/**
 * @author Christian Lopes de Oliveira 31 de mar de 2022
 * @execicio Introdução a orientação a objetos com Java
 */
public class EnderecoCliente {

	public enum TipoEndereco {
		RESISENCIAL, ENTREGA, TRABALHO
	}

	public String endereco;
	public String numero;
	public String complemento;
	public String cidade;
	public String estado;
	public String cep;
	public TipoEndereco tipo;
}
