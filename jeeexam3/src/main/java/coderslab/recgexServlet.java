package coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/regex")

public class recgexServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("param1") != null) {

            String param1 = request.getParameter("param1");

            if (param1.matches("[a-z]+\\.(gif|jpg|png)")) {
                response.sendRedirect("https://www.google.pl/#q=cat.jpg ");
            } else {
                request.setAttribute("parameter", "Niepoprawna nazwa");
                getServletContext().getRequestDispatcher("/mvc/regex.jsp").forward(request, response);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/mvc/quoteform.jsp").forward(request,response);




    }
}
