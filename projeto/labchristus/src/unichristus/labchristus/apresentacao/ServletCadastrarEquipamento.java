package unichristus.labchristus.apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import unichristus.labchristus.dominio.equipamentos.ControleEquipamentos;
import unichristus.labchristus.persistencia.TipoEquipamento;

/**
 * Servlet implementation class ServletCadastrarEquipamento
 */
@WebServlet("/CadastrarEquipamento")
public class ServletCadastrarEquipamento extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCadastrarEquipamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Prepara a tela de inclusão de equipamento
		TipoEquipamento[] tipos = ControleEquipamentos.obterTiposEquipamento();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("tiposEquipamento", tipos);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/equipamentos/escolherTipo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Processa a escolha do tipo de equipamento e exibe a página de
		// cadastramento adequada.
		String tipo = request.getParameter("tipo");
		System.out.println(tipo);
		String pagina = "";
		if (tipo.equals(TipoEquipamento.ESTABILIZADOR.name())) {
			pagina = "estabilizador.jsp";
		} else if (tipo.equals(TipoEquipamento.IMPRESSORA.name())) {
			pagina = "impressora.jsp";
		} else if (tipo.equals(TipoEquipamento.MICRO.name())) {
			pagina = "micro.jsp";
		} else if (tipo.equals(TipoEquipamento.MONITOR.name())) {
			pagina = "micro.jsp";
		} else if (tipo.equals(TipoEquipamento.PEN_DRIVE.name())) {
			pagina = "pendrive.jsp";
		} else if (tipo.equals(TipoEquipamento.PROJETOR_MULTIMIDIA.name())) {
			pagina = "projetor.jsp";
		}
	
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/equipamentos/" + pagina);
		dispatcher.forward(request, response);

	}

}
