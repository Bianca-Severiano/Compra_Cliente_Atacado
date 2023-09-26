package view;

import controller.OperacaoController;
import model.Cliente;
import model.Fila;

public class Principal {

	public static void main(String[] args) {

		Fila<Cliente> clientes = new Fila<>();
		OperacaoController a = new OperacaoController();

		for (int i = 1; i < 21; i++) {
			Cliente c = new Cliente();
			c.Nome = "Cliente" + i;
			c.QuantidadePecas = (int) (Math.random() * 31) + 20;
			c.ValorPeca = (float) (Math.random() * 95) + 5;
			clientes.insert(c);
		}

		a.Caixa(clientes);

	}

}
