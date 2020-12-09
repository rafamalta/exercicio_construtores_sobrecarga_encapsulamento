package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contabc;
		
		System.out.print("Informe o numero da conta: ");		
		int conta = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Gostaria de fazer um deposito inicial? (S/N) ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Informe o valor: ");
			double valor = sc.nextDouble();	
			contabc = new ContaBancaria(conta, nome, valor);
			System.out.println(contabc);
		}
		else {			
			contabc = new ContaBancaria(conta, nome);
			System.out.println(contabc);
		}
		
		System.out.print("Informe o valor do deposito: ");
			double deposito = sc.nextDouble();
			contabc.deposito(deposito);
			System.out.println(contabc);
			
			System.out.print("Informe o valor do saque: ");
			double saque = sc.nextDouble();
			contabc.saque(saque);
			System.out.println(contabc);
		
		sc.close();
	}

}
