package br.gov.sp.fatec.mazebank.tests;
import static org.junit.Assert.assertEquals;

import br.gov.sp.fatec.mazebank.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class DepositarFeature {
	Conta conta;
	@Dado("que eu tenho a conta de {string} do cpf {string}")
	public void que_eu_tenho_a_conta_de_do_cpf(String nome, String cpf) {
	    conta = new Conta(nome, cpf);
	}

	@Quando("eu efetuar um depósito de {double}")
	public void eu_efetuar_um_depósito_de(Double deposito) {
	    conta.depositar(deposito);
	}

	@Quando("efetuar outro depósito de {double}")
	public void efetuar_outro_depósito_de(Double deposito) {
		conta.depositar(deposito);
	}

	@Então("o saldo deverá ser de {double}")
	public void o_saldo_deverá_ser_de(Double novoSaldo) {
	    assertEquals(novoSaldo, conta.getSaldo());
	}


}
