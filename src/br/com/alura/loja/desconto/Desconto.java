package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	 protected Desconto next;
	
	public Desconto(Desconto next) {
		this.next = next;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
