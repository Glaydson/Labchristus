package unichristus.labchristus.apresentacao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unichristus.labchristus.dominio.equipamentos.EquipamentoDTO;
import unichristus.labchristus.dominio.movimentacoes.ControleMovimentacoes;
import unichristus.labchristus.dominio.movimentacoes.PesquisaMovimentacaoDTO;

/**
 * Servlet implementation class FronteiraMovimentacao
 */
@WebServlet("/FronteiraMovimentacao")
public class FronteiraMovimentacao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FronteiraMovimentacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Obtêm o dto com os parâmetros para iniciar o caso de uso
		PesquisaMovimentacaoDTO dto = ControleMovimentacoes
				.registrarMovimentacao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PesquisaMovimentacaoDTO dto = new PesquisaMovimentacaoDTO();
		// recebe os parâmetros da tela e monta o dto
		try {
			List<EquipamentoDTO> equipamentos = ControleMovimentacoes
					.pesquisar(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
