package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	 protected Desconto next;
	
	public Desconto(Desconto next) {
		this.next = next;
	}
	
	public BigDecimal doExecute(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return calcula(orcamento);
		}
		return next.doExecute(orcamento);
	}
	

	public abstract BigDecimal calcula(Orcamento orcamento);
	
	public abstract Boolean deveAplicar(Orcamento orcamento);
}
