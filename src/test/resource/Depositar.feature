# language:pt
# encoding: utf-8
Funcionalidade: depositar um valor em uma conta
	Esta funcionalidade tem por fim efetuar testes de dep�sito banc�rio de uma conta
	Cen�rio: depositando um valor qualquer
		Dado que eu tenho a conta de "Trevor Phillips" do cpf "12345678909"
		Quando eu efetuar um dep�sito de 1000.0
		E efetuar outro dep�sito de 250.0
		Ent�o o saldo dep�sito ser de 1250.0