Feature: depositar um valor em uma conta
	Esta funcionalidade tem por fim efetuar testes de depósito bancário de uma conta
	Scenario: depositando um valor qualquer
		Given que eu tenho a conta de "Trevor Phillips" do cpf "12345678909"
		When eu efetuar um deposito de 1000.0
		And efetuar outro deposito de 250.0
		Then o saldo deposito dever ser de 1250.0