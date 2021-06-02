package loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orca = new Orcamento(new BigDecimal("100"));
		
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		
		System.out.println(calc.calcular(orca, new ISS()));
		System.out.println(calc.calcular(orca, new ICMS()));
	}
}
