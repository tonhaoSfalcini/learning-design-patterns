package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal desconto = new DescontoQtdeDeItensMaiorQueCinco().calcular(orcamento);
		if(desconto.equals(BigDecimal.ZERO)) {
			desconto = new DescontoOrcamentoValorMaiorQueQuinhentos().calcular(orcamento);
		}
		
		return BigDecimal.ZERO;
	}
}
