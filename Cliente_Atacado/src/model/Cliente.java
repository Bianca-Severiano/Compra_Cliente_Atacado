package model;

public class Cliente {

	public String Nome;
	public int QuantidadePecas;
	public float ValorPeca;

	public Cliente(String Nome, int QuantidadePecas, float ValorPeca) {
		this.Nome = Nome;
		this.QuantidadePecas = QuantidadePecas;
		this.ValorPeca = ValorPeca;
	}

	public Cliente() {
		super();
	}

	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", QuantidadePecas=" + QuantidadePecas + ", ValorPeca=" + ValorPeca + "]";
	}

}
