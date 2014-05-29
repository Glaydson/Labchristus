package unichristus.labchristus.dominio.equipamentos;

public class Processador {

	private String fabricante;
	private String marca;
	private double clock;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getClock() {
		return clock;
	}

	public void setClock(double clock) {
		this.clock = clock;
	}

}
