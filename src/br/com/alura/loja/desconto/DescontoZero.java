package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoZero extends Desconto{
	
	public DescontoZero() {
		super(null);
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
