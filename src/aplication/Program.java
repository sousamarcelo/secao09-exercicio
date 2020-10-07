package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o numero da conta: ");
		String numero = sc.next();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Deseja realizar um deposito inicial (y/n)?: ");
		char saldoInicial = sc.next().charAt(0);
		if (saldoInicial == 'y') {
			System.out.print("Digite o valor para deposito inicial: ");
			double saldo  = sc.nextDouble();
			conta = new Conta(numero, titular, saldo);
		} else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		conta.deposita(sc.nextDouble());
		System.out.println("Atualizando dados da conta: ");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		conta.saca(sc.nextDouble());
		System.out.println("Atualizando dados da conta: ");
		System.out.println(conta.toString());
		
		sc.close();

	}

}
