package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/apply")
public class ApplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String food = request.getParameter("user_food");
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setFood(food);
        DBManager.addUser(user);
        response.sendRedirect("/home");
    }
}