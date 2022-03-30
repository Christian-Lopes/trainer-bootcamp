/**
 * @Curso Bootcampp DIO
 * @diciplina Vari�vel em Java
 * @professor Thiago Leite
 */
package br.com.dio.condicionaisefluxo.aula2;

/**
 * @author Christian Lopes de Oliveira 30 de mar de 2022
 * @execicio Controle de Fluxo
 */
public class Main {

	public static void main(String[] args) {
		ifFlecha();
		ifSemFlecha();
		ifFerias("Janeiro");
		ifFerias("Fevereiro");
		ifMenor();
		switchSemana("Quinta");
		switchNumero(4);
		switchFerias("janeiro");
	}

	// N�o � uma boa pr�tica o uso de IF->flecha
	public static void ifFlecha() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Mar�o");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else {
									if (mes == 8) {
										System.out.println("Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void ifSemFlecha() {
		int mes = 7;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Mar�o");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Op��o inv�lida!");
		}
	}

	private static void ifFerias(String mesFerias) {
		String mes = mesFerias;
		if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("F�rias...");
		} else {
			System.out.println("Lamento mais n�o � o momento.");
		}
	}

	private static void ifMenor() {
		double salarioMensal = 12893.68d;
		double mediaSalario = 10500.50d;

		int quantidadeDependentes = 4;
		int mediaDependente = 2;

		// N�o � boa pr�ticar as condi��es do if ficar muito longas
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependente)) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		} else {
			System.out.println("Fucion�rio n�o pode receber aux�lio.");
		}

		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitoDependentes = quantidadeDependentes >= mediaDependente;

		if ((salarioBaixo) && (muitoDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		} else {
			System.out.println("Fucion�rio n�o pode receber aux�lio.");
		}

		boolean receberAuxilio = salarioBaixo && muitoDependentes;

		if (receberAuxilio) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		} else {
			System.out.println("Fucion�rio n�o pode receber aux�lio.");
		}

	}

	private static void switchSemana(String semana) {
		switch (semana) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Ter�a":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "S�bado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
	}

	private static void switchNumero(int numero) {
		switch (numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo.");
			break;
		case 4:
			System.out.println("Errado.");
			break;
		case 5:
			System.out.println("Talvez.");
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;

		}
	}

	private static void switchFerias(String mes) {
		switch (mes) {
		case "dezembro":
		case "julho":
		case "janeiro":
			System.out.println("F�rias");
			break;
		default:
			System.out.println("M�s normal.");
			break;
		}
	}

}
