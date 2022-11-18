import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class JDBCStatementsetresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns", "root", "admin");
			Statement st = con.createStatement();
			String query = "select employeeId, employeeName from employee";
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmt = rs.getMetaData();
			System.out.println(rsmt);
			int cols = rsmt.getColumnCount();
			while(rs.next()) {
				for(int i=1; i<=cols;i++)
				{
					System.out.println(rs.getString(i)+ "\t");
					
				}
				System.out.println("");
			}
			st.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
