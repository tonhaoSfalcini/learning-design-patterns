package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Orcamento {

	private BigDecimal valor;
	private Integer qtdeItens;
}
