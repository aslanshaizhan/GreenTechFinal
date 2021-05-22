package servlet;

import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/AllUsersServlet")
public class AllusersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        try {
            List<User> users = userDAO.findAll();
            request.setAttribute("users",users);
            request.getRequestDispatcher("listUsers.jsp").forward(request,response);
        }catch (SQLException|ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
