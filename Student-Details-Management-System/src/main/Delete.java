package main;
import java.io.*;
import java.sql.*;
 class Delete {
	
	public static void main(String args[])
	{
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter SID");
	String SID=br.readLine();
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","248");
	Statement stmt=con.createStatement();
	String q1="delete from NIT_WARANGAL where SID='"+SID+"'";
	int t=stmt.executeUpdate(q1);
	if(t>0)
	System.out.println("Deleted Successfully");
	con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}

