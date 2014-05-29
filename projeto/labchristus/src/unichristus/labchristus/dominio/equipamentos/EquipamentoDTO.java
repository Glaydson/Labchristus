package unichristus.labchristus.dominio.equipamentos;

import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.dominio.sedes.Sede;
import unichristus.labchristus.persistencia.TipoEquipamento;

public class EquipamentoDTO {

	private String codigo;
	private TipoEquipamento tipo;
	private Sede sede;
	private Lotacao lotacao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoEquipamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEquipamento tipo) {
		this.tipo = tipo;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Lotacao getLotacao() {
		return lotacao;
	}

	public void setLotacao(Lotacao lotacao) {
		this.lotacao = lotacao;
	}

}
