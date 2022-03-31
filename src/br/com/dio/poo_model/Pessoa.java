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
			throw new RuntimeException("Documento não pode ser nulo ou vazio.");
		}

		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
		} else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Documento inválido para pessoa física ou jurídica.");
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
			System.out.println("O seu CPF é: " + documento);
		}else if(documento.length() == TAMANHO_CNPJ) {
			System.out.println("O seu CNPJ é: " + documento);
		}
	}

}
