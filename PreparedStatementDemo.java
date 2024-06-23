//Program to write Prepared Statement
//Prepared Statement - update the values in single/remaining query


import java.sql.*;


public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/databl";
		String username="root";
		String password="12345";
		int id=103;
		String name="Loy";
		
		String query="insert into tab values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //completed
		Connection con = DriverManager.getConnection(url,username,password); //completed
		PreparedStatement st = con.prepareStatement(query); //completed
		
		st.setInt(1, id);
		st.setString(2, name);
		
		int rs = st.executeUpdate(); //completed
		System.out.println(rs+" row/s affected");
		
		//Connection
		st.close();  //completed
		con.close();  //completed
		
	}

}