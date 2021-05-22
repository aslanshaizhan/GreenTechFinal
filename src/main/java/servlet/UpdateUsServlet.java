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

@WebServlet("/update")
public class UpdateUsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        try {
            Integer uid = 0;
            if (request.getRequestDispatcher("uid") != null){
                uid = Integer.parseInt(request.getParameter("uid"));
            }
            User user1 = userDAO.getById(uid);
            request.setAttribute("user1",user1);

            request.getRequestDispatcher("editForm.jsp").forward(request,response);

        }catch (SQLException|ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
