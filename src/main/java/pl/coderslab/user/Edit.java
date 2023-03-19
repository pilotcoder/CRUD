package pl.coderslab.user;

import pl.coderslab.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/edit")
public class Edit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idRaw = request.getParameter("id");
        int id = Integer.parseInt(idRaw);

        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        request.setAttribute("user", user);
        System.out.println(user.toString());
        getServletContext().getRequestDispatcher("/users/edit.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email  = request.getParameter("email");
        String password = request.getParameter("password");
        String idRaw = request.getParameter("id");
        int id = Integer.parseInt(idRaw);

        if(Add.verifyEmail(email)){
            User editedUser = new User(id, email, username, password);
            UserDao userDao = new UserDao();
            userDao.update(editedUser);
            response.sendRedirect(request.getContextPath() + "/user/list");

        }else{
            response.sendRedirect("https://steemitimages.com/DQmfXBksZ6bUAsjxNyZrdqfNsquRFnSxMzdbeBYEatLVrfZ/images.jpg");
        }






    }
}
