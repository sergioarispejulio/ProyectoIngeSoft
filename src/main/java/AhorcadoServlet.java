import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AhorcadoServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametro = request.getParameter("letra");
		ComandosJuego ahorcado = new ComandosJuego();
		String letra = new String(parametro);
		response.getWriter().println(ahorcado.verificarletra(letra));
	}
}
