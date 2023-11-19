<%@ page import="com.example.tomcatpractice.entity.Order" %>
<%@ page import="java.util.Map" %>

<html>
<head>
    <title>Orders</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<%
    Map<Integer, Order> orders = (Map<Integer, Order>) request.getAttribute("orders");
    if (orders != null && !orders.isEmpty()) {
%>
<h1>Orders</h1>
<table class="table table-dark table-striped">
    <thead>
    <tr>
        <th scope="col">Order ID</th>
        <th scope="col">Order date</th>
        <th scope="col">Total cost</th>
        <th scope="col">Products</th>
    </tr>
    </thead>
    <tbody>
    <% for (Order order : orders.values()) { %>
    <tr>
        <td><a href="<%= request.getContextPath() %>/orders?id=<%= order.getId() %>"><%= order.getId() %>
        </a></td>
        <td><%= order.getDate() %>
        </td>
        <td><%= order.getCost() %>
        </td>
        <td><%= order.getProducts().size() %>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
<%
} else {
%>
<p>No orders found</p>
<%
    }
%>

</body>
</html>
