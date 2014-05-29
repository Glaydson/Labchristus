package unichristus.labchristus.dominio.equipamentos;

import java.util.List;

public class Micro extends Equipamento {

	private String tombamento;
	private Processador processador;
	private int qtdeUsb;
	private boolean discoOptico;
	private List<DiscoRigido> discosRigidos;
	private List<MemoriaRAM> memorias;

	public String getTombamento() {
		return tombamento;
	}

	public void setTombamento(String tombamento) {
		this.tombamento = tombamento;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public int getQtdeUsb() {
		return qtdeUsb;
	}

	public void setQtdeUsb(int qtdeUsb) {
		this.qtdeUsb = qtdeUsb;
	}

	public boolean isDiscoOptico() {
		return discoOptico;
	}

	public void setDiscoOptico(boolean discoOptico) {
		this.discoOptico = discoOptico;
	}

	public List<DiscoRigido> getDiscosRigidos() {
		return discosRigidos;
	}

	public void setDiscosRigidos(List<DiscoRigido> discosRigidos) {
		this.discosRigidos = discosRigidos;
	}

	public List<MemoriaRAM> getMemorias() {
		return memorias;
	}

	public void setMemorias(List<MemoriaRAM> memorias) {
		this.memorias = memorias;
	}

}
