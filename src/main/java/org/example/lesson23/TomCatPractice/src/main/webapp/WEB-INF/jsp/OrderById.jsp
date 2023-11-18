<%@ page import="com.example.tomcatpractice.entity.Order" %>
<%@ page import="com.example.tomcatpractice.entity.Product" %>

<html>
<head>
    <title>OrderById</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<%
    Order order = (Order) request.getAttribute("order");
    if (order != null) {
%>
<h1>Order info</h1>

ID: <%= order.getId() %><br>
Date: <%= order.getDate() %><br>
Total cost: <%= order.getCost() %><br>
Product list:<br>

<% for (Product product : order.getProducts()) { %>
<li>
    <a href="<%= request.getContextPath() %>/product?productId=<%= product.getId() %>"><%= product.getId() %>
    </a>
    <%= product.getName() %>
    <%= product.getCost() %>
</li>
<% } %>
<%
} else {
%>
<p>Order not found</p>
<%
    }
%>

</body>
</html>