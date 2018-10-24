# language:pt
Funcionalidade: depositar um valor em uma conta
	Esta funcionalidade tem por fim efetuar testes de depósito bancário de uma conta
	Cenario: depositando um valor qualquer
		Dado que eu tenho a conta de "Trevor Phillips" do cpf "12345678909"
		Quando eu efetuar um depósito de 1000.0
		E efetuar outro depósito de 250.0
		Então o saldo deverá ser de 1250.0
		