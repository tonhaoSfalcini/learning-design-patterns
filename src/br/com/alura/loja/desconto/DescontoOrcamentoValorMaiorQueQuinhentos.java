package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoValorMaiorQueQuinhentos extends Desconto{
	
	public DescontoOrcamentoValorMaiorQueQuinhentos(Desconto next) {
		super(next);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQtdeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return next.calcular(orcamento);
	}
}
