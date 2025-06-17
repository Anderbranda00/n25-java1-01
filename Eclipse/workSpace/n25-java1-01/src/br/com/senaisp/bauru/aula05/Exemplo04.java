package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento:");
		String dtNasc = sc.nextLine();
		// Criando um scanner apoio
		Scanner sc2 = new Scanner(dtNasc); // Passando o texto
		sc.useDelimiter("/"); // Mudando o demilitador para /
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		System.out.println("Voce tem " + (2025 - ano) + "anos");
		sc.close();
		sc2.close();
		// Verificando se o mês é valido
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 31) {
				System.out.println("Data Válida");
			} else {
				System.out.println("Data Invalida");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30) {
				System.out.println("Data Válida");
			} else {
				System.out.println("Data Invalida");

			}
			break;
		case 2:
			if (dia >= 1 && dia <= 28 || dia == 29 && ano % 4 == 0) {
				System.out.println("Data Valida");
			} else {
				System.out.println("Data Invalida");
			}

			break;
		default:
			System.out.println("Data Invalida");

		}
	}
}
