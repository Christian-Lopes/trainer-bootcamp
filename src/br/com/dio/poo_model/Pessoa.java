/**
 * @Curso Bootcampp DIO
 * @diciplina Orienta��o a Objeto
 * @professor(a) Rodrigo Tavares
 */
package br.com.dio.poo_model;

/**
 * @author Christian Lopes de Oliveira 31 de mar de 2022
 * @execicio Introdu��o a orienta��o a objetos com Java
 */
public class Pessoa {

	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;

	public enum TipoPessoa {
		FISICA, JURIDICA
	}

	public Integer codigo;
	public String nome;
	private String documento;
	public TipoPessoa tipo;

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento n�o pode ser nulo ou vazio.");
		}

		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
		} else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Documento inv�lido para pessoa f�sica ou jur�dica.");
		}
		this.documento = documento;
	}

	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public TipoPessoa getTipo() {
		return tipo;
	}
	
	public void show() {
		if(documento.length() == TAMANHO_CPF) {
			System.out.println("O seu CPF �: " + documento);
		}else if(documento.length() == TAMANHO_CNPJ) {
			System.out.println("O seu CNPJ �: " + documento);
		}
	}

}
