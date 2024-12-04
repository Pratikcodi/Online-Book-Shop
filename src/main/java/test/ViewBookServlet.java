package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewBookServlet extends GenericServlet{
public ViewBookDAO ob=null;
@Override
public void init()throws ServletException{
	ob= new ViewBookDAO();
}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<BookBean>al=ob.retrive();
		req.setAttribute("alist", al);
		RequestDispatcher rd=req.getRequestDispatcher("ViewBook.jsp");
		rd.forward(req, res);
		
	}

}
