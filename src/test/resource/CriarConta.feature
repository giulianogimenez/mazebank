# language:pt
# encoding: utf-8
Funcionalidade: Criar uma nova conta
	Esta funcionalidade tem o cen�rio de criar uma nova conta de um cliente da Maze Bank.
	S�o obrigat�rios o nome e o CPF do cliente.
	Cen�rio: Criar uma conta de pessoa f�sica.
		Dado que eu deseje criar uma conta na Maze Bank
		Quando eu informar o nome "Trevor Phillips" e o CPF "12345678909"
		Ent�o dever� emitir o saldo de 0.0
	Cen�rio: criar uma conta de pessoa fisica sem o cpf
		Quando eu informar o nome "Trevor Phillips" e o CPF vazio
		Ent�o dever� vir com saldo nulo