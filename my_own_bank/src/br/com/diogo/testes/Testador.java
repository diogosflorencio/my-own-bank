package br.com.diogo.testes;

import br.com.diogo.clientes.Titular;
import br.com.diogo.contas.Conta;
import br.com.diogo.contas.ContaCorrente;

public class Testador {

	public static void main(String[] args) {
		
		Titular tt1 = new Titular("Diogo", "123-321");
		
		Conta cc1 = new ContaCorrente(123, tt1);
		Conta cc2 = new ContaCorrente(123, tt1);
		
		System.out.println(Conta.ContadorDeContas);

	}

}
