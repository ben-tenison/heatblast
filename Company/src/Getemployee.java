import java.sql.*;

public class Getemployee {
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="Aadhi599";
		String Query="select * from giant";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
			System.out.println(rs.getInt(7));
			System.out.println(rs.getInt(8));
			System.out.println(rs.getString(9));
			System.out.println(rs.getDate(10));
			System.out.println(rs.getDate(11));
		
		}
		con.close();
	}
public static void main(String []args) throws Exception {
	insert();
}

}
