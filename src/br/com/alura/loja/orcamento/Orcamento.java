package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.situacao.EmAnalise;
import br.com.alura.loja.situacao.SituacaoOrcamento;
import lombok.Data;

@Data
public class Orcamento { 

	private BigDecimal valor;
	private Integer qtdeItens;
	
	private SituacaoOrcamento situacao; 
	
	
	public void aplicaDescontoExtra() {
		this.situacao.calcularValorDescontoExtra(this);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void emAnalise() {
		this.situacao.emAnalise(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public Orcamento(BigDecimal valor, Integer qtdeItens) {
		this.valor = valor;
		this.qtdeItens = qtdeItens;
		this.situacao = new EmAnalise();
	}
}
