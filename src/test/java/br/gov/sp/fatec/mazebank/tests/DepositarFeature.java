package br.gov.sp.fatec.mazebank.tests;
import static org.junit.Assert.assertEquals;

import br.gov.sp.fatec.mazebank.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class DepositarFeature {
	Conta conta;
	@Dado("que eu tenho a conta de {string} do cpf {string}")
	public void que_eu_tenho_a_conta_de_do_cpf(String nome, String cpf) {
	    conta = new Conta(nome, cpf);
	}

	@Quando("eu efetuar um dep�sito de {double}")
	public void eu_efetuar_um_dep�sito_de(Double deposito) {
	    conta.depositar(deposito);
	}

	@Quando("efetuar outro dep�sito de {double}")
	public void efetuar_outro_dep�sito_de(Double deposito) {
		conta.depositar(deposito);
	}

	@Ent�o("o saldo dever� ser de {double}")
	public void o_saldo_dever�_ser_de(Double novoSaldo) {
	    assertEquals(novoSaldo, conta.getSaldo());
	}


}
