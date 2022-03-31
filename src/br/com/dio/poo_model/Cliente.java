/**
 * @Curso Bootcampp DIO
 * @diciplina Orientação a Objeto
 * @professor(a) Rodrigo Tavares
 */
package br.com.dio.poo_model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Lopes de Oliveira 31 de mar de 2022
 * @execicio Introdução a orientação a objetos com Java
 */
public class Cliente extends Pessoa {

	public String numCartao;
	private List<EnderecoCliente> enderecos;

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(List<EnderecoCliente> endereco) {
		this.enderecos = endereco;
	}

	public void addEndereco(EnderecoCliente endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço não pode ser nulo!");
		}

		if (endereco.cep == null) {
			throw new NullPointerException("CEP não pode ser nulo!");
		}

		getEndereco().add(endereco);
	}

	/**
	 * @return the endereco
	 */
	private List<EnderecoCliente> getEndereco() {
		if (enderecos == null) {
			enderecos = new ArrayList<EnderecoCliente>();
		}
		return enderecos;
	}

}
