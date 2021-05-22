package servlet;

import dao.BlogDAO;
import dao.CourseDAO;
import model.Blog;
import model.Course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AllCourseServlet")
public class AllCourseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Course> courses = CourseDAO.getAllCourses();
        request.setAttribute("courses", courses);
        request.getRequestDispatcher("courses.jsp").forward(request,response);
    }
}
