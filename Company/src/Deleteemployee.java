import java.sql.*;
public class Deleteemployee {
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="Aadhi599";
		String Query="delete from giant where id=002";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst= con.prepareStatement(Query);
	
		pst.executeUpdate();
		con.close();
	}
public static void main(String []args) throws Exception {
	insert();
}
}
