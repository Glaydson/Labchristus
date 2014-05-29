package unichristus.labchristus.dominio.equipamentos;

import java.util.ArrayList;
import java.util.List;

import unichristus.labchristus.dominio.lotacoes.ControleLotacoes;
import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.dominio.movimentacoes.ControleMovimentacoes;
import unichristus.labchristus.dominio.movimentacoes.Movimentacao;
import unichristus.labchristus.dominio.movimentacoes.PesquisaMovimentacaoDTO;
import unichristus.labchristus.persistencia.EquipamentoDAO;
import unichristus.labchristus.persistencia.TipoEquipamento;

public class ControleEquipamentos {

	private static final String BRANCO = "";

	/**
	 * Prepara a inclusão de um novo equipamento
	 * 
	 * @return
	 */
	public static TipoEquipamento[] obterTiposEquipamento() {

		return EquipamentoDAO.obterTiposEquipamento();
	}

	public static List<EquipamentoDTO> buscarEquipamentos(
			PesquisaMovimentacaoDTO dto) throws Exception {
		// Verifica se os campos obrigatórios estão preenchidos
		if (dto.getSedeSelecionada() == null
				|| dto.getSedeSelecionada().equals("BRANCO")) {
			throw new Exception("Sede não selecionada.");
		}
		if (dto.getTipoSelecionado() == null
				|| dto.getTipoSelecionado().equals("BRANCO")) {
			throw new Exception("Tipo do equipamento não selecionado");
		}
		return EquipamentoDAO.buscarEquipamentos(dto);
	}

	/**
	 * Retorna todos os equipamentos do tipo selecionado.
	 * 
	 * @param tipoSelecionado
	 * @return
	 */
	public static List<Equipamento> buscarPeloTipo(String tipoSelecionado) {

		return EquipamentoDAO.buscarPeloTipo(tipoSelecionado);
	}

	/**
	 * Prepara uma instancia vazia do equipamento que se deseja incluir
	 * 
	 * @param tipoEquipamento
	 * @return
	 */
	public static Equipamento prepararInclusaoEquipamento(String tipoEquipamento) {

		Equipamento equip = null;
		if (tipoEquipamento.equals(TipoEquipamento.ESTABILIZADOR)) {

			equip = new Estabilizador();

		}
		return equip;

	}

	public static List<Lotacao> cadastrar(Equipamento e) throws Exception {
		validar(e);
		List<Lotacao> lotacoes = ControleLotacoes.obterLotacoes();
		return lotacoes;

	}

	public static void validar(Equipamento e) throws Exception {
		List<String> erros = new ArrayList<String>();
		if (e.getCodigo() == null || e.getCodigo().equals(BRANCO)) {
			erros.add("Código não preenchido");
		}

		if (e instanceof Estabilizador) {

			if (((Estabilizador) e).getMarca() == null
					|| ((Estabilizador) e).getMarca().equals(BRANCO)) {
				erros.add("Marca não preenchida");
			}

			if (((Estabilizador) e).getModelo() == null
					|| ((Estabilizador) e).getModelo().equals(BRANCO)) {
				erros.add("Modelo não preenchido");
			}

			if (((Estabilizador) e).getPotencia() == 0) {
				erros.add("Potência inválida");
			}
		}

		if (erros.size() != 0) {
			throw new Exception(erros.toString());
		}
	}

	public void registrarEntrada(Equipamento e, Lotacao lot) {

		e.setLotacao(lot);
		if (e instanceof Estabilizador) {
			e.setTipoEquip(TipoEquipamento.ESTABILIZADOR);
		}
		Movimentacao mov = ControleMovimentacoes.registrarEntrada(e);
		List<Movimentacao> movs = new ArrayList<Movimentacao>();
		movs.add(mov);
		e.setMovimentacoes(movs);
		EquipamentoDAO.inserir(e);

	}

}
