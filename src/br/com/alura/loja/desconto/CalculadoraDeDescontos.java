package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto descontos = new DescontoQtdeDeItensMaiorQueCinco(
							new DescontoOrcamentoValorMaiorQueQuinhentos(
							new DescontoZero()));
		
		return descontos.doExecute(orcamento);
	}
}
