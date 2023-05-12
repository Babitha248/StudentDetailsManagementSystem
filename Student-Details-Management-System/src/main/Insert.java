package main;
import java.io.*;
import java.sql.*;

public class Insert {
	
	public static void main(String args[])
	{
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter SID");
	String SID=br.readLine();
	System.out.println("Enter Name");
	String NAME=br.readLine();
	System.out.println("Enter Branch");
	String BRANCH=br.readLine();
	System.out.println("Enter Percentage");
	String PERCENTAGE=br.readLine();
	System.out.println("Enter Phone No.");
	String PHONE=br.readLine();
	System.out.println("Enter Address");
	String ADDRESS=br.readLine();
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","248");
	Statement stmt=con.createStatement();
	String q1="INSERT INTO NIT_WARANGAL VALUES('"+SID+"','"+NAME+"','"+BRANCH+"','"+PERCENTAGE+"','"+PHONE+"','"+ADDRESS+"')";
	int t=stmt.executeUpdate(q1);
	if(t>0)
	System.out.println("Inserted Successfully");
	con.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}


