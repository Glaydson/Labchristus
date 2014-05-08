package unichristus.labchristus.persistencia;

public enum TipoEquipamento {

	ESTABILIZADOR, IMPRESSORA, MICRO, MONITOR, PEN_DRIVE, PROJETOR_MULTIMIDIA;
	
	public String getNome() {
		return this.name();
	}

}
