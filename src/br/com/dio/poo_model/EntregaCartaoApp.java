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
public class EntregaCartaoApp {
	public static void main(String[] args) {
		// Endere�o do cliente
		EnderecoCliente endereco = new EnderecoCliente();
		endereco.cep = "000000000";

		// Cliente
		Cliente cliente = new Cliente();

		try {
			cliente.addEndereco(endereco);
			System.out.println("Endere�o inserido com sucesso.");
			cliente.setDocumento("03195468107");
			cliente.show();
			cliente.setDocumento("031954681072397");
			cliente.show();
		} catch (Exception e) {
			System.err.println("Erro ao adicionar o endereco: " + e.getMessage());
		}
	}
}
