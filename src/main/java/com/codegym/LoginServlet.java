package com.codegym;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="LoginServlet", urlPatterns="/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        boolean valid = "admin".equals(request.getParameter("username")) && "admin".equals(request.getParameter("password"));
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Login Result</title></head><body>");
            out.println(valid ? "<h1>Welcome admin to website</h1>" : "<h1>Login Error</h1>");
            out.println("<a href='index.jsp'>Go back</a></body></html>");
        }
    }
}
