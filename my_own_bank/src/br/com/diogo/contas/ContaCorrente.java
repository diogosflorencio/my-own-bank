package br.com.diogo.contas;

import br.com.diogo.clientes.Titular;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia, Titular titular) {
		super.ContadorDeContas++;
		super.agencia = agencia;
		super.titular = titular;
	}
	
	@Override
	public void Deposita(Double valor) {
		super.saldo = valor;
		
	}

	@Override
	public void Saca(Double valor) {
		super.saldo -= valor;
		
	}

	@Override
	public void Transfere(Double valor, Conta conta) {
		super.saldo -= valor;
		conta.Deposita(valor);
		
	}

}
