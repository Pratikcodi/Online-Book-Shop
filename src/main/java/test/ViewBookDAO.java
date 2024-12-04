package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewBookDAO {

public ArrayList<BookBean>retrive(){
	 ArrayList<BookBean>al=new ArrayList<BookBean>();
	try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("select * from BookDetails");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			BookBean bb= new BookBean();
			bb.setBcode(rs.getString(1));
			bb.setBname(rs.getString(2));
			bb.setBauthor(rs.getString(3));
			bb.setBprice(rs.getInt(4));
			bb.setBqty(rs.getInt(5));
			al.add(bb);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return al;
}
}
