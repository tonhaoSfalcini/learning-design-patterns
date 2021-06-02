package br.com.alura.loja.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	public void emAnalise(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser colocado Em Análise");
	}
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser Aprovado");
	}
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser Reprovado");
	}
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser Finalizado");
	}
	
}
