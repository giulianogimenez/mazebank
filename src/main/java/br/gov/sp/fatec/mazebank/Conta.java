package br.gov.sp.fatec.mazebank;

/**
 * @author giuliano
 *
 */
public class Conta {
	private String nome, cpf;
	private Double saldo;
	
	public Conta(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		if(validarCPF(cpf)) {
			this.saldo = 0d;	
		}
	}


	private boolean validarCPF(String cpf) {
		return !cpf.trim().equals("");
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSaldo() {
		return saldo;
	}


	public void depositar(Double deposito) {
		this.saldo = this.saldo + deposito;
		
	}
}
