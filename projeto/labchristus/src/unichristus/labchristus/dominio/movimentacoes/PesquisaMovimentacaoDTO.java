package unichristus.labchristus.dominio.movimentacoes;

import java.util.List;

public class PesquisaMovimentacaoDTO {
	
	private String codigoEquipamento;
	private List<String> tiposEquipamento;
	private List<String> sedes;
	private String tipoSelecionado;
	private String sedeSelecionada;
	public String getCodigoEquipamento() {
		return codigoEquipamento;
	}
	public void setCodigoEquipamento(String codigoEquipamento) {
		this.codigoEquipamento = codigoEquipamento;
	}
	public List<String> getTiposEquipamento() {
		return tiposEquipamento;
	}
	public void setTiposEquipamento(List<String> tiposEquipamento) {
		this.tiposEquipamento = tiposEquipamento;
	}
	public List<String> getSedes() {
		return sedes;
	}
	public void setSedes(List<String> sedes) {
		this.sedes = sedes;
	}
	public String getTipoSelecionado() {
		return tipoSelecionado;
	}
	public void setTipoSelecionado(String tipoSelecionado) {
		this.tipoSelecionado = tipoSelecionado;
	}
	public String getSedeSelecionada() {
		return sedeSelecionada;
	}
	public void setSedeSelecionada(String sedeSelecionada) {
		this.sedeSelecionada = sedeSelecionada;
	}
	
	

}
