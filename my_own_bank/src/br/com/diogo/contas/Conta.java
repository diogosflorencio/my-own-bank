package br.com.diogo.contas;

import br.com.diogo.clientes.Titular;

public abstract class Conta {
	public static int ContadorDeContas = 0;
	protected Double saldo;
	protected int agencia;
	protected Titular titular;
	
	public abstract void Deposita(Double valor);
	
	public abstract void Saca(Double valor);
	
	public abstract void Transfere(Double valor, Conta conta);

	
	

}
