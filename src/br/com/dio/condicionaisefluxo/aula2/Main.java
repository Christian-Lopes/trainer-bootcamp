/**
 * @Curso Bootcampp DIO
 * @diciplina Variável em Java
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

	// Não é uma boa prática o uso de IF->flecha
	public static void ifFlecha() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Março");
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
			System.out.println("Março");
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
			System.out.println("Opção inválida!");
		}
	}

	private static void ifFerias(String mesFerias) {
		String mes = mesFerias;
		if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("Férias...");
		} else {
			System.out.println("Lamento mais não é o momento.");
		}
	}

	private static void ifMenor() {
		double salarioMensal = 12893.68d;
		double mediaSalario = 10500.50d;

		int quantidadeDependentes = 4;
		int mediaDependente = 2;

		// Não é boa práticar as condições do if ficar muito longas
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependente)) {
			System.out.println("Funcionário deve receber auxílio.");
		} else {
			System.out.println("Fucionário não pode receber auxílio.");
		}

		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitoDependentes = quantidadeDependentes >= mediaDependente;

		if ((salarioBaixo) && (muitoDependentes)) {
			System.out.println("Funcionário deve receber auxílio.");
		} else {
			System.out.println("Fucionário não pode receber auxílio.");
		}

		boolean receberAuxilio = salarioBaixo && muitoDependentes;

		if (receberAuxilio) {
			System.out.println("Funcionário deve receber auxílio.");
		} else {
			System.out.println("Fucionário não pode receber auxílio.");
		}

	}

	private static void switchSemana(String semana) {
		switch (semana) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
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
		case "Sábado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
			System.out.println("Opção inválida.");
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
			System.out.println("Opção inválida!");
			break;

		}
	}

	private static void switchFerias(String mes) {
		switch (mes) {
		case "dezembro":
		case "julho":
		case "janeiro":
			System.out.println("Férias");
			break;
		default:
			System.out.println("Mês normal.");
			break;
		}
	}

}
