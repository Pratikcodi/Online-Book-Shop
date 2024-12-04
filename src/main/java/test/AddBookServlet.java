package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookServlet extends GenericServlet{
public BookBean bb=null;
public AddBookDAO abo=null;
@Override
public void init()throws ServletException{
	bb=new BookBean();
	abo=new AddBookDAO();
}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		bb.setBcode(req.getParameter("code"));
		bb.setBname(req.getParameter("name"));
		bb.setBauthor(req.getParameter("author"));
		bb.setBprice(Integer.parseInt(req.getParameter("price")));
		bb.setBqty(Integer.parseInt(req.getParameter("qty")));
		int k=abo.insertBookDetails(bb);
		if(k>0) {
			RequestDispatcher rd= req.getRequestDispatcher("AddBook.jsp");
			rd.forward(req, res);
		}
		
		
	}

}
