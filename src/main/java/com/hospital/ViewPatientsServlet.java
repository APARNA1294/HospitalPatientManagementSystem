package com.hospital;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewPatients")
public class ViewPatientsServlet extends HttpServlet
{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hospital Patients</h1>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<th>Patient Name</th>");
		out.println("<th>Disease</th>");
		out.println("<th>Doctor Name</th>");
		out.println("<th>Mobile</th>");
		out.println("<th>Delete</th>");
		out.println("<th>Edit</th>");
		out.println("</tr>");
		try
		{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM PATIENTS");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getInt("id")+"</td>");
				out.println("<td>"+rs.getString("patient_name")+"</td>");
				out.println("<td>"+rs.getString("disease")+"</td>");
				out.println("<td>"+rs.getString("doctor_name")+"</td>");
				out.println("<td>"+rs.getString("mobile")+"</td>");
				out.println("<td>");
				out.println("<a href='delete?id="+rs.getInt("id")+"'>Delete</a>");
				out.println("</td>");
				out.println("<td>");
				out.println("<a href='edit?id="+rs.getInt("id")+"'>Edit</a>");
				out.println("</td>");
				out.println("</tr>");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}