package unichristus.labchristus.dominio.equipamentos;

import java.util.List;

import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.dominio.movimentacoes.Movimentacao;
import unichristus.labchristus.persistencia.TipoEquipamento;

public class Equipamento {

	private String codigo;
	private List<Movimentacao> movimentacoes;
	private TipoEquipamento tipoEquip;
	private Lotacao lotacao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public TipoEquipamento getTipoEquip() {
		return tipoEquip;
	}

	public void setTipoEquip(TipoEquipamento tipo) {
		this.tipoEquip = tipo;
	}

	public Lotacao getLotacao() {
		return lotacao;
	}

	public void setLotacao(Lotacao lotacao) {
		this.lotacao = lotacao;
	}

}
