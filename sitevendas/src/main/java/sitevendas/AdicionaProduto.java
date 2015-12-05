package sitevendas;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adiciona")
public class AdicionaProduto extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("SERVICE");
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String valor = request.getParameter("valor");
		String codigo = request.getParameter("codigo");
		String dataEmTexto = request.getParameter("data");
		Date data = null;
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			data = simpleDateFormat.parse(dataEmTexto);
		} catch (ParseException e) {
			out.println("Erro na conversão de data");
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<div class=\"alert alert-success\" role=\"alert\">Produto adicionado com sucesso</div>\"");
		out.println("Data " + data.toString() + " parseado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
}
