package unichristus.labchristus.dominio.lotacoes;

import java.util.List;

import unichristus.labchristus.persistencia.LotacaoDAO;

public class ControleLotacoes {

	public static List<Lotacao> obterLotacoes() {
		return LotacaoDAO.obterLotacoes();
	}

}
