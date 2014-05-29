package unichristus.labchristus.dominio.lotacoes;

import unichristus.labchristus.dominio.sedes.Sede;

public class Lotacao {

	private String nome;
	private int andar;
	private Sede sede;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}
