package br.com.alura.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/oi")
public class OiServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

                PrintWriter out = resp.getWriter();

                out.println("<html>");
                out.println("<body>");
                out.println("Oi Mundo! Primeira Servlet");
                out.println("</body>");
                out.println("</html>");

                System.out.println("o servlet OiServlet foi chamado");



    }
}
