package coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/homepage")

public class HomepageServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String yes= request.getParameter("yes");
        String[] accept = request.getParameterValues("option");


        for (String currence : accept) {
            if (currence.equals(yes)) {
                Cookie cookie = new Cookie("form", "active");
                response.addCookie(cookie);
            }
            response.getWriter().println("dodano cookie");
            response.sendRedirect(request.getContextPath() + "/hompepage");


        }
    }

}