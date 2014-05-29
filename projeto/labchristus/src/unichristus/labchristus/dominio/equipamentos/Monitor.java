package unichristus.labchristus.dominio.equipamentos;

public class Monitor extends EquipamentoComNumeroSerie {

	private String tipo;
	private int tamanhoTela;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

}
