import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CriarContaFeature {
	Conta conta;
	@Dado("que eu deseje criar uma conta na Maze Bank")
	public void que_eu_deseje_criar_uma_conta_na_Maze_Bank() {
	    
	}

	@Quando("eu informar o nome {string} e o CPF {string}")
	public void eu_informar_o_nome_e_o_CPF(String nome, String cpf) {
	    conta = new Conta(nome, cpf);
	}

	@Então("deverá emitir o saldo de {double}")
	public void deverá_emitir_o_saldo_de(Double saldo) {
		assertEquals(saldo, conta.getSaldo());
	}
	
	@Quando("eu informar o nome {string} e o CPF vazio")
	public void eu_informar_o_nome_e_o_CPF_vazio(String nome) {
		conta = new Conta(nome, "");
	}

	@Então("deverá vir com saldo nulo")
	public void deverá_vir_com_saldo_nulo() {
		assertNull(conta.getSaldo());
	}


}
