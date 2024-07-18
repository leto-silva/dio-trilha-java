package dadosbanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//
		ContaBancaria contaBancaria;		
		String agencia, nomeCliente;
		int numero;
		double saldo;
		Scanner sc;
		
		//iniciando o scanner
		sc = new Scanner(System.in);
		
		System.out.println("Favor digite a sua agência: ");
		agencia = sc.next();
		
		System.out.println("Favor digite o número da sua conta bancária: ");
		numero = sc.nextInt();
		
		System.out.println("Favor digite o seu nome: ");
		nomeCliente = sc.next();
		
		System.out.println("Favor digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		//Criando conta bancária
		contaBancaria = new ContaBancaria(numero, agencia, nomeCliente, saldo);
		
		//Imprimindo informações da conta bancária
		System.out.println("************************************************************************************");
		System.out.println("**************************INFORMAÇÕES DA CONTA BANCÁRIA*****************************");
		System.out.println(contaBancaria);
		System.out.println("************************************************************************************");
		
	}

}
