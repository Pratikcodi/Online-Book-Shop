<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details</title>
<style>
/* Styling for the body */
body {
    font-family: Arial, sans-serif;
    background: linear-gradient(120deg, #8e44ad, #3498db, #2ecc71);
    background-size: 400% 400%;
    animation: gradientBG 8s ease infinite;
    margin: 0;
    padding: 0;
    color: #fff;
}

/* Animation for background */
@keyframes gradientBG {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

/* Styling for the table container */
.table-container {
    width: 80%;
    margin: 50px auto;
    background: rgba(255, 255, 255, 0.9);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    color: #333;
}

/* Styling for the table */
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}

table th, table td {
    border: 1px solid #ccc;
    padding: 10px;
    text-align: left;
}

table th {
    background-color: #3498db;
    color: #fff;
    text-transform: uppercase;
}

table tr:nth-child(even) {
    background-color: #f2f2f2;
}

/* Styling for the link */
a {
    display: inline-block;
    margin-top: 20px;
    text-decoration: none;
    color: #fff;
    background-color: #2ecc71;
    padding: 10px 20px;
    border-radius: 5px;
    transition: 0.3s;
}

a:hover {
    background-color: #27ae60;
}
</style>
</head>
<body>
<div class="table-container">
    <h1>Book Details</h1>
    <%
    ArrayList<BookBean> al = (ArrayList<BookBean>) request.getAttribute("alist");
    if (al != null && !al.isEmpty()) {
    %>
    <table>
        <thead>
            <tr>
                <th>Book Code</th>
                <th>Book Name</th>
                <th>Book Author</th>
                <th>Book Price</th>
                <th>Book Quantity</th>
            </tr>
        </thead>
        <tbody>
            <%
            Iterator<BookBean> it = al.iterator();
            while (it.hasNext()) {
                BookBean bb = it.next();
            %>
            <tr>
                <td><%= bb.getBcode() %></td>
                <td><%= bb.getBname() %></td>
                <td><%= bb.getBauthor() %></td>
                <td><%= bb.getBprice() %></td>
                <td><%= bb.getBqty() %></td>
            </tr>
            <%
            }
            %>
        </tbody>
    </table>
    <%
    } else {
        out.println("<p>No books available!</p>");
    }
    %>
    <a href="book.html">Add Book</a>
</div>
</body>
</html>
