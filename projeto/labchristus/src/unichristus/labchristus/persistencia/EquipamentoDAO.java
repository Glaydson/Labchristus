package unichristus.labchristus.persistencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import unichristus.labchristus.dominio.equipamentos.DiscoRigido;
import unichristus.labchristus.dominio.equipamentos.Equipamento;
import unichristus.labchristus.dominio.equipamentos.EquipamentoDTO;
import unichristus.labchristus.dominio.equipamentos.MemoriaRAM;
import unichristus.labchristus.dominio.equipamentos.Micro;
import unichristus.labchristus.dominio.equipamentos.Monitor;
import unichristus.labchristus.dominio.equipamentos.Processador;
import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.dominio.movimentacoes.Movimentacao;
import unichristus.labchristus.dominio.movimentacoes.PesquisaMovimentacaoDTO;

public class EquipamentoDAO {

	private static List<Equipamento> equipamentos;

	public EquipamentoDAO() {
		equipamentos = new ArrayList<Equipamento>();
		carregarEquipamentos();
	}

	/**
	 * Carrega alguns equipamentos para teste
	 */
	private void carregarEquipamentos() {

		// Adiciona um Micro
		Micro e1 = new Micro();
		e1.setCodigo("M001");
		e1.setTombamento("TB001");
		e1.setTipoEquip(TipoEquipamento.MICRO);
		e1.setDiscoOptico(true);
		e1.setQtdeUsb(2);
		DiscoRigido disco = new DiscoRigido();
		disco.setMarca("Seagate");
		disco.setTamanhoHD(500);
		List<DiscoRigido> discos = new ArrayList<DiscoRigido>();
		discos.add(disco);
		e1.setDiscosRigidos(discos);
		Processador p = new Processador();
		p.setFabricante("Intel");
		p.setMarca("Core I7");
		p.setClock(3.0);
		e1.setProcessador(p);
		MemoriaRAM memoria = new MemoriaRAM();
		memoria.setMarca("Kingston");
		memoria.setTamanho(2);
		memoria.setFrequencia(2.5);
		List<MemoriaRAM> memorias = new ArrayList<MemoriaRAM>();
		memorias.add(memoria);
		e1.setMemorias(memorias);
		Movimentacao mov1 = new Movimentacao();
		mov1.setData(new Date());
		mov1.setEquipamento(e1);
		mov1.setNumero(001);
		mov1.setTipo(TipoMovimentacao.ENTRADA);
		List<Lotacao> lotacoes = LotacaoDAO.obterLotacoes();
		mov1.setLotacaoDestino(lotacoes.get(0));
		e1.setLotacao(lotacoes.get(0));
		List<Movimentacao> movime1 = new ArrayList<Movimentacao>();
		movime1.add(mov1);
		e1.setMovimentacoes(movime1);

		// Adiciona um Monitor
		Monitor e2 = new Monitor();
		e2.setTipoEquip(TipoEquipamento.MONITOR);
		e2.setCodigo("M002");
		e2.setMarca("Samsung");
		e2.setModelo("S211");
		e2.setNumeroSerie("FAESESEE");
		e2.setTamanhoTela(21);
		e2.setTipo("LCD");
		Movimentacao mov2 = new Movimentacao();
		mov2.setData(new Date());
		mov2.setEquipamento(e2);
		mov2.setNumero(002);
		mov2.setTipo(TipoMovimentacao.ENTRADA);
		mov2.setLotacaoDestino(lotacoes.get(1));
		e2.setLotacao(lotacoes.get(1));
		List<Movimentacao> movime2 = new ArrayList<Movimentacao>();
		movime2.add(mov2);
		e1.setMovimentacoes(movime2);

		equipamentos.add(e1);
		equipamentos.add(e2);

	}

	/**
	 * Retorna a lista de tipos de equipamento existentes no sistema.
	 * 
	 * @return
	 */
	public static TipoEquipamento[] obterTiposEquipamento() {
		return TipoEquipamento.values();
	}

	/**
	 * Busca os equipamentos que satisfazem as condições especificadas na
	 * pesquisa.
	 * 
	 * @param dto
	 * @return
	 */
	public static List<EquipamentoDTO> buscarEquipamentos(
			PesquisaMovimentacaoDTO dto) {
		List<EquipamentoDTO> equipamentos = new ArrayList<EquipamentoDTO>();
		// busca os equipamentos com o tipo selecionado

		return null;
	}

	/**
	 * Retorna todos os equipamentos do tipo selecionado.
	 * 
	 * @param tipoSelecionado
	 * @return
	 */
	public static List<Equipamento> buscarPeloTipo(String tipoSelecionado) {
		List<Equipamento> equipamentosTipo = new ArrayList<Equipamento>();
		for (Equipamento e : equipamentos) {
			if (e.getTipoEquip().name().equals(tipoSelecionado)) {
				equipamentosTipo.add(e);
			}
		}
		return equipamentosTipo;
	}
	
	public static void inserir(Equipamento e) {
		equipamentos.add(e);
	}

}
