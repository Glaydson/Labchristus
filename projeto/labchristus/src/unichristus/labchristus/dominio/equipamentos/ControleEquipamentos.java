package unichristus.labchristus.dominio.equipamentos;

import unichristus.labchristus.persistencia.EquipamentoDAO;
import unichristus.labchristus.persistencia.TipoEquipamento;

public class ControleEquipamentos {

	/**
	 * Prepara a inclusão de um novo equipamento
	 * 
	 * @return
	 */
	public static TipoEquipamento[] obterTiposEquipamento() {

		return EquipamentoDAO.obterTiposEquipamento();
	}

}
