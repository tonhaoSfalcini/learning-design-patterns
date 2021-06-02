package loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		testaImpostos(new BigDecimal("100"), 1);
		testaDescontos(new BigDecimal("150"), 15);
		testaDescontos(new BigDecimal("650"), 2);
		
	}

	private static void testaImpostos(BigDecimal valor, Integer qtdeItens) {
		Orcamento orca = new Orcamento(valor, qtdeItens);
		
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		
		System.out.println("ISS >> "+calc.calcular(orca, new ISS()));
		System.out.println("ICMS >> "+calc.calcular(orca, new ICMS()));
	}

	private static void testaDescontos(BigDecimal valor, Integer qtdeItens) {
		Orcamento orca = new Orcamento(valor, qtdeItens);
		
		CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
		
		System.out.println(">> "+orca.getQtdeItens() +" > "+ orca.getValor() +" >> "+ calc.calcular(orca));
	}
}
