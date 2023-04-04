package com.vitorcamara.projetos;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class AumentoAnual {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat format = new DecimalFormat("###,###"); //objeto DecimalFormat criado para formatação do resultado final
		
		System.out.println("Qual o salário inicial?");
		double salarioInicial = scan.nextDouble();
		
		System.out.println("Qual o ano inicial?");
		int anoInicial = scan.nextInt();
		
		System.out.println("Qual o percentual do aumento anual?");
		double aumentoAnual = scan.nextDouble();
		
		int anoAtual;
		do{
			System.out.println("Qual o ano atual? (precisa ser maior que o ano inicial)");
		
		anoAtual = scan.nextInt();
		} while(anoAtual <= anoInicial);
		
		
		for (int i = (anoInicial+1); i <= anoAtual; i++) { // anoInicial + 1, pois começamos a calcular a partir do ano seguinte ao o informado 
		    salarioInicial += salarioInicial * (aumentoAnual / 100.0); // salario recebe ele mesmo somado com adicional do aumento percentual anual
		    System.out.println("Salário em " + i + " = " + (format.format(salarioInicial)));
		}

	}

}
