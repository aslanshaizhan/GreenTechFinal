package servlet;

import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/updateUser")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
    Integer id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String role = request.getParameter("role");
    String password = request.getParameter("password");

        UserDAO userDAO = new UserDAO();
    User user = new User();
    user.setId(id);
    user.setName(name);
    user.setEmail(email);
    user.setRole(role);
    user.setPassword(password);

    try {
        boolean status = userDAO.update(user);
        if (status) {
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else {
            out.print("Error!");
        }

    }catch (SQLException|ClassNotFoundException e) {
        System.out.println(e);
    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
