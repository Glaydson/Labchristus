package unichristus.labchristus.persistencia;

import java.util.ArrayList;
import java.util.List;

import unichristus.labchristus.dominio.movimentacoes.Movimentacao;

public class MovimentacaoDAO {
	
	private static List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

	public static void inserir(Movimentacao mov) {
		movimentacoes.add(mov);
		
	}

}
