package controller;

import model.Cliente;
import model.Fila;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	public void Caixa(Fila<Cliente> fila) {
		float valorTotal;

		for (int i = 0; i < 20; i++) {
			try {
				Cliente cliente = fila.remove();
				valorTotal = cliente.ValorPeca * cliente.QuantidadePecas;
				System.out.println("Nome: " + cliente.Nome + " == Valor total: R$" + valorTotal);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
