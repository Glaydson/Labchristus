package unichristus.labchristus.dominio.equipamentos;

import java.util.List;

import unichristus.labchristus.dominio.movimentacoes.PesquisaMovimentacaoDTO;
import unichristus.labchristus.persistencia.EquipamentoDAO;
import unichristus.labchristus.persistencia.TipoEquipamento;

public class ControleEquipamentos {

	/**
	 * Prepara a inclus�o de um novo equipamento
	 * 
	 * @return
	 */
	public static TipoEquipamento[] obterTiposEquipamento() {

		return EquipamentoDAO.obterTiposEquipamento();
	}

	public static List<EquipamentoDTO> buscarEquipamentos(
			PesquisaMovimentacaoDTO dto) throws Exception {
		// Verifica se os campos obrigat�rios est�o preenchidos
		if (dto.getSedeSelecionada() == null
				|| dto.getSedeSelecionada().equals("BRANCO")) {
			throw new Exception("Sede n�o selecionada.");
		}
		if (dto.getTipoSelecionado() == null
				|| dto.getTipoSelecionado().equals("BRANCO")) {
			throw new Exception("Tipo do equipamento n�o selecionado");
		}
		return EquipamentoDAO.buscarEquipamentos(dto);
	}

	/**
	 * Retorna todos os equipamentos do tipo selecionado.
	 * @param tipoSelecionado
	 * @return
	 */
	public static List<Equipamento> buscarPeloTipo(String tipoSelecionado) {
		
		return EquipamentoDAO.buscarPeloTipo(tipoSelecionado);
	}

}
