package unichristus.labchristus.dominio.movimentacoes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unichristus.labchristus.dominio.equipamentos.ControleEquipamentos;
import unichristus.labchristus.dominio.equipamentos.Equipamento;
import unichristus.labchristus.dominio.equipamentos.EquipamentoDTO;
import unichristus.labchristus.dominio.sedes.ControleSedes;
import unichristus.labchristus.dominio.sedes.Sede;
import unichristus.labchristus.persistencia.MovimentacaoDAO;
import unichristus.labchristus.persistencia.TipoEquipamento;
import unichristus.labchristus.persistencia.TipoMovimentacao;

public class ControleMovimentacoes {

	public static PesquisaMovimentacaoDTO registrarMovimentacao() {

		// obtêm os tipos de equipamento cadastrados
		TipoEquipamento[] tiposEquipamento = ControleEquipamentos
				.obterTiposEquipamento();
		List<Sede> listaSedes = ControleSedes.obterSedes();
		PesquisaMovimentacaoDTO dto = new PesquisaMovimentacaoDTO();
		List<String> tiposEquip = new ArrayList<String>();
		for (TipoEquipamento tipo : tiposEquipamento) {
			tiposEquip.add(tipo.name());
		}
		dto.setTiposEquipamento(tiposEquip);
		List<String> sedes = new ArrayList<String>();
		for (Sede s : listaSedes) {
			sedes.add(s.getNome());
		}
		dto.setSedes(sedes);
		return dto;
	}

	/**
	 * Pesquisa equipamentos que atendam os critérios informados na pesquisa
	 * 
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	public static List<EquipamentoDTO> pesquisar(PesquisaMovimentacaoDTO dto)
			throws Exception {
		List<EquipamentoDTO> equipamentos = new ArrayList<EquipamentoDTO>();
		// Busca os equipamentos com o tipo selecionado
		List<Equipamento> equipamentosTipo = ControleEquipamentos
				.buscarPeloTipo(dto.getTipoSelecionado());
		for (Equipamento e : equipamentosTipo) {
			if (e.getLotacao().getSede().getNome()
					.equals(dto.getSedeSelecionada())) {
				EquipamentoDTO edto = new EquipamentoDTO();
				edto.setCodigo(dto.getCodigoEquipamento());
				edto.setLotacao(e.getLotacao());
				edto.setSede(e.getLotacao().getSede());
				edto.setTipo(e.getTipoEquip());
				equipamentos.add(edto);
			}
		}
		return equipamentos;
	}

	public static Movimentacao registrarEntrada(Equipamento e) {
		Movimentacao mov = new Movimentacao();
		mov.setData(new Date());
		mov.setEquipamento(e);
		mov.setLotacaoDestino(e.getLotacao());
		mov.setNumero(1);
		mov.setTipo(TipoMovimentacao.ENTRADA);
		MovimentacaoDAO.inserir(mov);
		return mov;
	}

}
