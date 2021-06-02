package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Orcamento {

	private BigDecimal valor;
	private Integer qtdeItens;
	private String situacao;
	
	
	public void aplicaDescontoExtra() {
		if(situacao.equals("ANALISE")) {
			this.valor = this.valor.subtract(this.valor.multiply(new BigDecimal("0.05")));
		}else if(situacao.equals("APROVADO")) {
			this.valor = this.valor.subtract(this.valor.multiply(new BigDecimal("0.02")));
		}
	}
	
	public void aprovar() {
		this.situacao = "APROVADO";
	}

	public void iniciarAnalise() {
		this.situacao = "ANALISE";
	}
}
