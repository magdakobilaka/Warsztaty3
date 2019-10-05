package coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/createCookie")

public class CreateCookie extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String value = request.getParameter("value");

        Cookie cookie = new Cookie(name, value);
        response.addCookie(cookie);

        Cookie[] cookies = request.getCookies();

        String cookieValue = null;
        for (Cookie c : cookies) {
            if ("cookieName".equals(c.getName())) {
                cookieValue = c.getValue();
            }
        }


    }

}
