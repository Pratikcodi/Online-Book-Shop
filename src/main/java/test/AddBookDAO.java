package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBookDAO {
public int k =0;
public int insertBookDetails(BookBean bb) {
	try {
		Connection con =DBConnection.getCon();
		PreparedStatement ps= con.prepareStatement("insert into BookDetails values(?,?,?,?,?)");
		ps.setString(1, bb.getBcode());
		ps.setString(2, bb.getBname());
		ps.setString(3, bb.getBauthor());
		ps.setInt(4, bb.getBprice());
		ps.setInt(5,bb.getBqty());
		k = ps.executeUpdate();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return k;
}
}
