package br.gov.sp.fatec.mazebank.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.gov.sp.fatec.mazebank.Conta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositarFeature {	
	Conta conta;
	@Given("que eu tenho a conta de {string} do cpf {string}")
	public void que_eu_tenho_a_conta_de_do_cpf(String nome, String cpf) {
		conta = new Conta(nome, cpf);
	}

	@When("eu efetuar um deposito de {double}")
	public void eu_efetuar_um_deposito_de(Double deposito) {
	    conta.depositar(deposito);
	}

	@When("efetuar outro deposito de {double}")
	public void efetuar_outro_deposito_de(Double deposito) {
	    conta.depositar(deposito);
	}

	@Then("o saldo deposito dever ser de {double}")
	public void o_saldo_deposito_dever_ser_de(Double saldo) {
	    assertEquals(saldo, conta.getSaldo());
	}

}
