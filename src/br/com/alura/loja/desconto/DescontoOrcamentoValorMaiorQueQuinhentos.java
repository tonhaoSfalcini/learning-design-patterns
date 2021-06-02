package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoValorMaiorQueQuinhentos {
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQtdeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return BigDecimal.ZERO;
	}
}
