package programa;

import dominio.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.agencia = "0001";
		conta.numeroDaConta = "0000001";
		System.out.println(conta.agencia);
		System.out.println(conta.numeroDaConta);
	}

}
