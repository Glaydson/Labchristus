package unichristus.labchristus.persistencia;


public class EquipamentoDAO {

	/**
	 * Retorna a lista de tipos de equipamento existentes no sistema.
	 * 
	 * @return
	 */
	public static TipoEquipamento[] obterTiposEquipamento() {
		return TipoEquipamento.values();
	}

}
