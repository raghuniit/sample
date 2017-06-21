
//To connect Ms access database  to create a table

import java.sql.*;

class Jdbc1
{
	public static void main(String args[])
	{
		try
		{
		//To register the ODBC Drivers
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");  

	
	//To create statements

	Statement stm=con.createStatement();

	String sql="create table emp(empid number,ename varchar(20))";

	stm.executeUpdate(sql);

	con.close();

	System.out.println("Table Created Successfully....");

		}
		catch(Exception e)
		{

		System.out.println("Error :"+e);
		}
	}
}
