package pl.coderslab.user;

import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/show")
public class Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idRaw = request.getParameter("id");
        int id = Integer.parseInt(idRaw);
        UserDao userDao = new UserDao();

        request.setAttribute("user", userDao.read(id));
        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
