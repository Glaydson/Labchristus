package unichristus.labchristus.persistencia;

import java.util.ArrayList;
import java.util.List;

import unichristus.labchristus.dominio.sedes.Sede;

public class SedeDAO {

	private static List<Sede> sedes;

	public SedeDAO() {
		sedes = new ArrayList<Sede>();
		carregarSedes();
	}

	private void carregarSedes() {
		Sede sede1 = new Sede();
		sede1.setNome("SEDE BENFICA");
		Sede sede2 = new Sede();
		sede2.setNome("SEDE DOM LUÍS");
		Sede sede3 = new Sede();
		sede3.setNome("SEDE PARQUE ECOLÓGICO");
		sedes.add(sede1);
		sedes.add(sede2);
		sedes.add(sede3);
	}

	public static List<Sede> obterSedes() {
		return sedes;
	}

}
