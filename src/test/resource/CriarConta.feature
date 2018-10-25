# language:pt
# encoding: utf-8
Funcionalidade: Criar uma nova conta
	Esta funcionalidade tem o cenário de criar uma nova conta de um cliente da Maze Bank.
	São obrigatórios o nome e o CPF do cliente.
	Cenário: Criar uma conta de pessoa física.
		Dado que eu deseje criar uma conta na Maze Bank
		Quando eu informar o nome "Trevor Phillips" e o CPF "12345678909"
		Então deverá emitir o saldo de 0.0
	Cenário: criar uma conta de pessoa fisica sem o cpf
		Quando eu informar o nome "Trevor Phillips" e o CPF vazio
		Então deverá vir com saldo nulo