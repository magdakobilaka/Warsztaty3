package coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/addquote")

public class quoteServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/mvc/quoteform.jsp").forward(request, response);


        List<Quote> quoteList;
        HttpSession sess = request.getSession();
        quoteList = (ArrayList<Quote>) sess.getAttribute("quoteList");

        if (quoteList == null) {
            quoteList = new ArrayList<>();

        }
        quoteList.add(new Quote(request.getParameter("name"), request.getParameter("content")));
        sess.setAttribute("quoteList", quoteList);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("<p>Dodawanie nowego autora</p>");
        response.getWriter().println("<form  method='post'' action='addquote'><br>");
        response.getWriter().println("Nazwa : <input type='text' name='author'><br>");
        response.getWriter().println("tresci autora : <input type='text' name='content'><br>");
        response.getWriter().println("<input type='submit' value='dodaj'>");
        response.getWriter().println("</form>");
        response.getWriter().println("<br>");
        response.getWriter().println("<a href='index.jsp'>index.jsp</a>");


    }
}
