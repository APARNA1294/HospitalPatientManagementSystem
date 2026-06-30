package com.hospital;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterPatient")
public class RegisterPatientServlet extends HttpServlet
{
	private static final long serialVersionUID=1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		String patientName=request.getParameter("patient_name");
		String disease=request.getParameter("disease");
		String doctorName=request.getParameter("doctor_name");
		String mobile=request.getParameter("mobile");
		try
		{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO PATIENTS(patient_name,disease,doctor_name,mobile) VALUES(?,?,?,?)");
			ps.setString(1, patientName);
			ps.setString(2, disease);
			ps.setString(3, doctorName);
			ps.setString(4, mobile);
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Patient Registered Successfully");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		response.sendRedirect("RegistrationSuccess.html");
	}
}