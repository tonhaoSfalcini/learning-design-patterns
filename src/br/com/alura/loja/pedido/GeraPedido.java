package br.com.alura.loja.pedido;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private Integer qtdeItens;
	
}
