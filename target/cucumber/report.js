$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/CriarConta.feature");
formatter.feature({
  "name": "Criar uma nova conta",
  "description": "\tEsta funcionalidade tem o cenário de criar uma nova conta de um cliente da Maze Bank.\n\tSão obrigatórios o nome e o CPF do cliente.",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Criar uma conta de pessoa física.",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que eu deseje criar uma conta na Maze Bank",
  "keyword": "Dado "
});
formatter.match({
  "location": "CriarContaFeature.que_eu_deseje_criar_uma_conta_na_Maze_Bank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o nome \"Trevor Phillips\" e o CPF \"12345678909\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarContaFeature.eu_informar_o_nome_e_o_CPF(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deverá emitir o saldo de 0.0",
  "keyword": "Então "
});
formatter.match({
  "location": "CriarContaFeature.deverá_emitir_o_saldo_de(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "criar uma conta de pessoa fisica sem o cpf",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "eu informar o nome \"Trevor Phillips\" e o CPF vazio",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarContaFeature.eu_informar_o_nome_e_o_CPF_vazio(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deverá vir com saldo nulo",
  "keyword": "Então "
});
formatter.match({
  "location": "CriarContaFeature.deverá_vir_com_saldo_nulo()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resource/Depositar.feature");
formatter.feature({
  "name": "depositar um valor em uma conta",
  "description": "\tEsta funcionalidade tem por fim efetuar testes de depósito bancário de uma conta",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "depositando um valor qualquer",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que eu tenho a conta de \"Trevor Phillips\" do cpf \"12345678909\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DepositarFeature.que_eu_tenho_a_conta_de_do_cpf(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu efetuar um depósito de 1000.0",
  "keyword": "Quando "
});
formatter.match({
  "location": "DepositarFeature.eu_efetuar_um_depósito_de(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "efetuar outro depósito de 250.0",
  "keyword": "E "
});
formatter.match({
  "location": "DepositarFeature.efetuar_outro_depósito_de(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o saldo deverá ser de 1250.0",
  "keyword": "Então "
});
formatter.match({
  "location": "DepositarFeature.o_saldo_deverá_ser_de(Double)"
});
formatter.result({
  "status": "passed"
});
});