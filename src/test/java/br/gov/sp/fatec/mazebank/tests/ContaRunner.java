package br.gov.sp.fatec.mazebank.tests;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resource", glue = "br.gov.sp.fatec.mazebank.tests")
public class ContaRunner {

}
