package controller;

import com.google.gson.Gson;
import dao.CourseDAO;
import dao.UserDAO;
import model.Course;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/addcourse")
public class AddController extends HttpServlet {
    private UserDAO userDao;
    private CourseDAO courseDao;

    @Override
    public void init() throws ServletException {
        userDao = UserDAO.UserDAO();
        courseDao = CourseDAO.CourseDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = (String) req.getSession().getAttribute("loggedInUser");
        User user = userDao.getUserByName(username);

        Course course = courseDao.getCourseById(req.getParameter("course"));
        if (user.hasCourse(req.getParameter("course"))) {
            String json = "{\"code\":\"-1\"}";
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(json);
        } else {
            user.addCourse(course);
            String json = new Gson().toJson(course);
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(json);
        }
    }
}
