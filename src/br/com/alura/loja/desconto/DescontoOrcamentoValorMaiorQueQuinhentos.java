package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoValorMaiorQueQuinhentos extends Desconto{
	
	public DescontoOrcamentoValorMaiorQueQuinhentos(Desconto next) {
		super(next);
	}

	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQtdeItens() > 5;
	}
}
