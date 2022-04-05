/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
 * @professor Thiago Leite
 */
package br.com.dio.introducao_java.base;

/**
 * @author Christian Lopes de Oliveira
 * 1 de abr de 2022
 * @execicio 
 */
public class Order {

	private final String code;
	
	public Order(String code) {
		this.code =code;
	}
	
	@Override
	public String toString() {
		return "Order={"+
				"code=' " + code + " ' " +
				"}";
	}
}
