package loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedidos {

	public static void main(String[] args) {
		Orcamento orca = new Orcamento(new BigDecimal("750"), 4);
		String cliente = "Tonhao";
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(cliente, data, orca);
		
		System.out.println("Salvar no Banco de Dados");
		System.out.println("Enviar email com dados do pedido");
	}
}
