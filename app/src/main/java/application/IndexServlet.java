package application;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        String n = request.getParameter("nome");
        request.setAttribute("nome", n);
        //response.getWriter().print("Hello " + n);
        request.getRequestDispatcher(
            "/WEB-INF/views/index.jsp").forward(request, response);
    }
}