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
import java.util.Random;


@WebServlet("/randomquote")

public class RandomQuotesServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("quoteList") != null) {
            List<Quote> quoteList = (ArrayList<Quote>) session.getAttribute("quoteList");
            Random rd = new Random();
            request.setAttribute("quote", quoteList.get(rd.nextInt(quoteList.size())));

        }
        getServletContext().getRequestDispatcher("/mvc/quote.jsp").forward(request, response);
    }
}




