import java.sql.*;
public class Insertemployee {
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="Aadhi599";
		String Query="insert into giant values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst= con.prepareStatement(Query);
		pst.setInt(1,002);
		pst.setString(2, "Men's Casual Shirt");
		pst.setString(3,"A comforatble cotton shirt, available in multiple colors");
		pst.setString(4, "Clothing");
		pst.setInt(5,35);
		pst.setInt(6, 20);
		pst.setInt(7, 300);
		pst.setInt(8,100);
		pst.setString(9,"FashionCorp, contact:0987654321, email:orders@gmail.com");
		pst.setDate(10,Date.valueOf("2024-01-15"));
		pst.setDate(11, Date.valueOf("2024-09-05"
				+ ""));
		
		pst.executeUpdate();
		con.close();
	}
public static void main(String []args) throws Exception {
	insert();
}
}
