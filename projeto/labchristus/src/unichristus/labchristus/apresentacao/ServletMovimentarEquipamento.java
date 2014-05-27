package unichristus.labchristus.apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMovimentarEquipamento
 */
@WebServlet("/Movimentar")
public class ServletMovimentarEquipamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMovimentarEquipamento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipoMov = request.getParameter("tipoMov");
		String url = "";
		if (tipoMov.equals("manutencao")) {
			url = "/movimentacao/enviarManutencao.html";
		} else if (tipoMov.equals("transferencia")) {
			url = "/movimentacao/transferirLotacao.html";
		} else if (tipoMov.equals("upgrade")) {
			url = "/movimentacao/fazerUpgrade.html";
		} else if (tipoMov.equals("substituicao")) {
			url = "/movimentacao/substituir.html";
		}
		RequestDispatcher disp = request.getRequestDispatcher(url);
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
