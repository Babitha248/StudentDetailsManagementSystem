package main;
import java.sql.*;
public class Create {
	public static void main(String[] args)throws Exception {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","248");
		Statement stmt=con.createStatement();
		stmt.execute("create table NIT_WARANGAL (SID int, SNAME varchar(50), BRANCH varchar(10), PERCENTAGE number(4,2), PHONE int, ADDRESS varchar(50)), Primary key(SID, PHONE);");
		System.out.println("NIT_WARANGAL Table Created Successfully...");
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		}
