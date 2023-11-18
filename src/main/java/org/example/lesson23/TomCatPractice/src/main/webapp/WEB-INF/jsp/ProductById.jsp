<%@ page import="com.example.tomcatpractice.entity.Product" %>

<html>
<head>
    <title>ProductById</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<%
    Product product = (Product) request.getAttribute("product");
    if (product != null) {
%>
<h1>Product info</h1>
<ul>
    <li>ID: <%= product.getId() %><br></li>
    <li>Name: <%= product.getName() %><br></li>
    <li>Cost: <%= product.getCost() %><br></li>
</ul>
<%
} else {
%>
<p>Product not found</p>
<%
    }
%>

</body>
</html>
