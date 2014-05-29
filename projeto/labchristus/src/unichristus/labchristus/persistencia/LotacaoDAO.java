package unichristus.labchristus.persistencia;

import java.util.ArrayList;
import java.util.List;

import unichristus.labchristus.dominio.lotacoes.Lotacao;
import unichristus.labchristus.dominio.sedes.Sede;

public class LotacaoDAO {

	private static List<Lotacao> lotacoes;
	
	public LotacaoDAO() {
		lotacoes = new ArrayList<Lotacao>();
		carregarLotacoes();
	}

	/**
	 * Carrega uma lista de lotações em memória para testes.
	 */
	private void carregarLotacoes() {
		Lotacao l1 = new Lotacao();
		l1.setNome("Sede Benfica Sala 101");
		l1.setAndar(1);
		List<Sede> sedes = SedeDAO.obterSedes();
		l1.setSede(sedes.get(0));
		
		Lotacao l2 = new Lotacao();
		l2.setNome("Sede Benfica Sala 204");
		l2.setAndar(2);
		l2.setSede(sedes.get(0));
		
		Lotacao l3 = new Lotacao();
		l3.setNome("Sede Benfica Secretaria");
		l3.setAndar(1);
		l3.setSede(sedes.get(0));
		
		Lotacao l4 = new Lotacao();
		l4.setNome("Sede Dom Luís Coordenação SI");
		l4.setAndar(5);
		l4.setSede(sedes.get(1));
		
		Lotacao l5 = new Lotacao();
		l5.setNome("Sede Dom Luís Coordenação Adm");
		l5.setAndar(5);
		l5.setSede(sedes.get(1));
		
		Lotacao l6 = new Lotacao();
		l6.setNome("Sede Dom Luís Laboratório SI");
		l6.setAndar(7);
		l6.setSede(sedes.get(1));
		
		Lotacao l7 = new Lotacao();
		l7.setNome("Sede Parque Ecológico Coordenação Medicina");
		l7.setAndar(1);
		l7.setSede(sedes.get(2));
		
		Lotacao l8 = new Lotacao();
		l8.setNome("Sede Parque Ecológico Laboratório Biologia");
		l8.setAndar(4);
		l8.setSede(sedes.get(2));
		
		Lotacao l9 = new Lotacao();
		l9.setNome("Sede Parque Ecológico Biblioteca");
		l9.setAndar(3);
		l9.setSede(sedes.get(2));
		
		lotacoes.add(l1);
		lotacoes.add(l2);
		lotacoes.add(l3);
		lotacoes.add(l4);
		lotacoes.add(l5);
		lotacoes.add(l6);
		lotacoes.add(l7);
		lotacoes.add(l8);
		lotacoes.add(l9);
	}
	
	public static List<Lotacao> obterLotacoes() {
		return lotacoes;
	}
	
}
