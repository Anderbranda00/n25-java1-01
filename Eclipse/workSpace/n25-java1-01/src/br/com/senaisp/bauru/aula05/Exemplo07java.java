package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exemplo07java {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite S ou N:");
	String res = sc.nextLine();
	//Usando operador termário
	//teste logico? Valor_se_verdade : valor_se_falso
	System.out.println("Você digitou" +
                      (res.charAt(0)=='s' ? "sim" : "não"));
    sc.close();                  

	}

}
