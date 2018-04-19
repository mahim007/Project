package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class DepartmentDAO {

	public Department findDepartmentById(int department_id)
	{
		//SELECT * FROM DEPARTMENTS WHERE department_id=10
		//connect with oracle
		Department department=null;
		try {			
			new OracleDriver();
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM DEPARTMENTS WHERE department_id="+department_id);
			while(rs.next())
			{
				department=new Department();
				department.setDepartment_id(rs.getInt(1));
				department.setDepartment_name(rs.getString(2));
				department.setLocation_id(rs.getInt(3));
				department.setManager_id(rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return department;
	}
	public ArrayList<Integer> getAllDepartmentIds()
	{
		ArrayList<Integer> ids=null;
		try {			
			new OracleDriver();
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM DEPARTMENTS");
			ids=new ArrayList<>();
			while(rs.next())
			{
				ids.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ids;
	}
		
	public static void main(String[] args) {
		Department dept= new DepartmentDAO().findDepartmentById(10);
		if(dept!=null)
			System.out.println("Data found");
		else
			System.out.println("Nothing found");
	}

}
