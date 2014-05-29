package unichristus.labchristus.dominio.movimentacoes;

import java.util.Date;

import unichristus.labchristus.dominio.equipamentos.Equipamento;
import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.persistencia.TipoMovimentacao;

public class Movimentacao {

	private int numero;
	private Date data;
	private TipoMovimentacao tipo;
	private Equipamento equipamento;
	private Lotacao lotacaoOrigem;
	private Lotacao lotacaoDestino;
	private String operacao;
	private String interventor;
	private String descricaoIntervencao;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Lotacao getLotacaoOrigem() {
		return lotacaoOrigem;
	}

	public void setLotacaoOrigem(Lotacao lotacaoOrigem) {
		this.lotacaoOrigem = lotacaoOrigem;
	}

	public Lotacao getLotacaoDestino() {
		return lotacaoDestino;
	}

	public void setLotacaoDestino(Lotacao lotacaoDestino) {
		this.lotacaoDestino = lotacaoDestino;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public String getInterventor() {
		return interventor;
	}

	public void setInterventor(String interventor) {
		this.interventor = interventor;
	}

	public String getDescricaoIntervencao() {
		return descricaoIntervencao;
	}

	public void setDescricaoIntervencao(String descricaoIntervencao) {
		this.descricaoIntervencao = descricaoIntervencao;
	}

}
