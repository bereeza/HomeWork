package com.example.tomcatpractice.servlet;

import com.example.tomcatpractice.entity.Product;
import com.example.tomcatpractice.service.ProductRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/product")
public class Products extends HttpServlet {
    private ProductRepository productRepo = new ProductRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productId = req.getParameter("productId");
        if (productId != null) {
            Product product = productRepo.getById(Integer.parseInt(productId));
            req.setAttribute("product", product);
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/ProductById.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.getWriter().println("Product ID is missing.");
        }
    }
}