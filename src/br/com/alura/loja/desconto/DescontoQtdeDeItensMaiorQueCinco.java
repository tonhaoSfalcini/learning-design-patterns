package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoQtdeDeItensMaiorQueCinco extends Desconto{

	public DescontoQtdeDeItensMaiorQueCinco(Desconto next) {
		super(next);
	}

	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
