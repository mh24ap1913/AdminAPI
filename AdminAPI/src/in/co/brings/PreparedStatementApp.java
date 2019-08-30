package in.co.brings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/brings_admin","root","root");
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		do{  
			System.out.println("enter id:");  
			int id=Integer.parseInt(sc.nextLine());  
			System.out.println("enter name:");  
			String name=sc.nextLine();  
			System.out.println("enter address:");  
			String addess=sc.nextLine() ; 
			pstmt.setInt(1,id);  
			pstmt.setString(2,name);  
			pstmt.setString(3,"pune");  
			int i=pstmt.executeUpdate();  
			System.out.println(i+" records affected");  
			  
			System.out.println("Do you want to continue: y/n");  
			String s=sc.nextLine();  
			if(s.startsWith("n")){  
			break;  
			}  
			}while(true);  
			  
			con.close();  
			}}  