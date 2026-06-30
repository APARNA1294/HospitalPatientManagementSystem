package com.hospital;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/edit")
public class EditPatientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try 
		{
			Connection con = DBConnect.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM PATIENTS WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) 
            {
            	out.println("<html>");
            	out.println("<body>");
            	out.println("<h1>Update Patient</h1>");
            	out.println("<form action='update' method='post'>");
            	out.println("<input type='hidden' name='id' value='"+ rs.getInt("id")+ "'>");
            	out.println("Patient Name:<br>");
            	out.println("<input type='text' name='patient_name' value='"+ rs.getString("patient_name")+"'><br><br>");
            	out.println("Disease:<br>");
            	out.println("<input type='text' name='disease' value='"+ rs.getString("disease")+ "'><br><br>");
            	out.println("Doctor Name:<br>");
            	out.println("<input type='text' name='doctor_name' value='"+ rs.getString("doctor_name")+ "'><br><br>");
            	out.println("Mobile:<br>");
            	out.println("<input type='text' name='mobile' value='"+rs.getString("mobile")+ "'><br><br>");
            	out.println("<input type='submit' value='Update'>");
            	out.println("</form>");
            	out.println("</body>");
            	out.println("</html>");
            }
            con.close();
	    }
		catch(Exception e) 
		{
			e.printStackTrace();
	    }
	 }
}