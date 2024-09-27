import java.sql.*;
public class Updateemployee {
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="Aadhi599";
		String Query="update giant set productName = 'Bag' where productId=001";
		 Query="update giant set description = 'leather bag used to carry books' where productId=001";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst= con.prepareStatement(Query);
	
		pst.executeUpdate();
		con.close();
	}
public static void main(String []args) throws Exception {
	insert();
}
}
