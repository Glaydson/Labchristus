package unichristus.labchristus.dominio.sedes;

import java.util.List;

import unichristus.labchristus.persistencia.SedeDAO;

/**
 * Controlador para sedes
 * @author glaydson
 *
 */
public class ControleSedes {

	public static List<Sede> obterSedes() {
		List<Sede> sedes = SedeDAO.obterSedes();
		return sedes;
	}
	
	

}
