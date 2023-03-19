package pl.coderslab.user;

import pl.coderslab.DbUtil;
import pl.coderslab.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet("/user/add")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/add.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email  = request.getParameter("email");
        String password = request.getParameter("password");


        if (verifyEmail(email)){
            UserDao userDao = new UserDao();
            User user = new User(email, username, password);
            userDao.create(user);
            response.sendRedirect(request.getContextPath() + "/user/list");

        }else{
            response.sendRedirect("https://steemitimages.com/DQmfXBksZ6bUAsjxNyZrdqfNsquRFnSxMzdbeBYEatLVrfZ/images.jpg");
        }

        }







    static boolean verifyEmail(String email) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,3}");
        return pattern.matcher(email).matches();
    }
}
