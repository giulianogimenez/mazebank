Feature: Criar uma nova conta
	Esta funcionalidade tem o cen�rio de criar uma nova conta de um cliente da Maze Bank.
	S�o obrigat�rios o nome e o CPF do cliente.
	Scenario: Criar uma conta de pessoa f�sica.
		Given que eu deseje criar uma conta na Maze Bank
		When eu informar o nome "Trevor Phillips" e o CPF "12345678909"
		Then deve vir o saldo de 0.0
	Scenario: criar uma conta de pessoa fisica sem o cpf
		When eu informar o nome "Trevor Phillips" e o CPF vazio
		Then deve vir o saldo nulo