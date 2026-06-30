package com.hospital;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/delete")
public class DeletePatientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected  void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		try
		{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("DELETE FROM PATIENTS WHERE id=?");
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Patient Deleted Successfully");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		response.sendRedirect("ViewPatients");
	}
}
