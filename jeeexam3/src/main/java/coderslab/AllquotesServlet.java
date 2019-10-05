package coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


@WebServlet("/allquotes")

public class AllquotesServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        response.getWriter().append("<html><head><meta charset='UTF-8'></meta></head><body>");
        if (session.getAttribute("quoteList") != null) {

            response.getWriter().append("<table>");
            response.getWriter().append("<tr><td>Author</td><td>Content</td></tr>");

            for (Quote quote : (ArrayList<Quote>) session.getAttribute("quoteList")) {
                response.getWriter().append("<tr><td>" + quote.getAutor() + "</td><td>" + quote.getContent() + "</td></tr>");
            }
            response.getWriter().append("</table>");

        }
        response.getWriter().println("<a href='index.jsp'>index.jsp</a>");
        response.getWriter().append("</body></html>");
        response.getWriter().println("<br>");
    }
}



