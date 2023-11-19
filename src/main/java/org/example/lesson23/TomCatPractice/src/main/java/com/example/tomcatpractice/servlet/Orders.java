package org.example.lesson23.TomCatPractice.src.main.java.com.example.tomcatpractice.servlet;

import com.example.tomcatpractice.entity.Order;
import com.example.tomcatpractice.service.OrderRepository;
import com.google.gson.Gson;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/orders")
public class OrderServlet extends HttpServlet {
    private OrderService repo = new OrderService();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (id != null) {
            Order order = repo.getById(Integer.parseInt(id));
            req.setAttribute("order", order);
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/OrderById.jsp");
            dispatcher.forward(req, resp);
        } else {
            Map<Integer, Order> orders = repo.getAll();
            req.setAttribute("orders", orders);
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/Orders.jsp");
            dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = gson.fromJson(req.getReader(), Order.class);
        repo.add(order);
        System.out.println(order);
        try (PrintWriter writer = resp.getWriter()) {
            writer.println(gson.toJson(order.getId()));
        }
    }
}
