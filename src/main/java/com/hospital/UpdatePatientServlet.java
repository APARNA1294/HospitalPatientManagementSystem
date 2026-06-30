package com.hospital;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/update")
public class UpdatePatientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String patientName=request.getParameter("patient_name");
		String disease=request.getParameter("disease");
		String doctorName=request.getParameter("doctor_name");
		String mobile=request.getParameter("mobile");
		try
		{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE PATIENTS SET patient_name=?,disease=?,doctor_name=?,mobile=? WHERE id=?");
			ps.setString(1, patientName);
			ps.setString(2, disease);
			ps.setString(3, doctorName);
			ps.setString(4, mobile);
			ps.setInt(5, id);
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Patient Updated Successfully");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("ViewPatients");
	}
}
