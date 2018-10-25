package br.gov.sp.fatec.mazebank.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import br.gov.sp.fatec.mazebank.Conta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CriarContaFeature {
	Conta conta;
	@Given("que eu deseje criar uma conta na Maze Bank")
	public void que_eu_deseje_criar_uma_conta_na_Maze_Bank() {
	    
	}

	@When("eu informar o nome {string} e o CPF {string}")
	public void eu_informar_o_nome_e_o_CPF(String nome, String cpf) {
	    conta = new Conta(nome, cpf);
	}

	@Then("deve vir o saldo de {double}")
	public void deve_vir_o_saldo_de(Double saldo) {
	    assertEquals(saldo, conta.getSaldo());
	}

	@When("eu informar o nome {string} e o CPF vazio")
	public void eu_informar_o_nome_e_o_CPF_vazio(String nome) {
	    conta = new Conta(nome, "");
	}

	@Then("deve vir o saldo nulo")
	public void deve_vir_o_saldo_nulo() {
	    assertNull(conta.getSaldo());
	}

}
