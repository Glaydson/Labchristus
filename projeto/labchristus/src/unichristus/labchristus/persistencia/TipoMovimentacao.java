package unichristus.labchristus.persistencia;

public enum TipoMovimentacao {

	ENTRADA, ENVIO_MANUTENCAO, TRANSFERENCIA, UPGRADE, SUBSTITUICAO;
	
	public String getNome() {
		return this.name();
	}

}
