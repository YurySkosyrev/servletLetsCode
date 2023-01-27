package letscode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/temp-serv")
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("/my-app/first-jsp.jsp");

        ArrayList<User> users = new ArrayList<User>() {{
            add(new User("Igor", "Russia", 24));
            add(new User("Mike", "Ukraine", 21));
            add(new User("Sergey", "USA", 25));
        }};

        req.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/first-jsp.jsp").forward(req, resp);
    }
}
