package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.LoanDAO;

import java.sql.Connection;

@WebServlet("/insert")
public class InsertLoanServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Get a database connection (you should have this in a separate utility class)
            Connection connection = YourDatabaseUtility.getConnection();

            // Create an instance of the LoanDAO class
            LoanDAO loanDAO = new LoanDAO(connection);

            // Retrieve data from the form
            String name = request.getParameter("name");
            String number = request.getParameter("number");
            String address = request.getParameter("address");
            String location = request.getParameter("location");
            String company = request.getParameter("company");
           
            String loanAmount = request.getParameter("loanAmount");
            String disbursementAmount = request.getParameter("disbursementAmount");
            String emi = request.getParameter("emi");
            String remark = request.getParameter("remark");

            // Insert data into the database
            boolean success = loanDAO.insertLoanData(name,number,address,location,company,loanAmount,disbursementAmount,emi,remark);

            if (success) {
                response.getWriter().println("Data inserted successfully!");
            } else {
                response.getWriter().println("Failed to insert data.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred.");
        }
    }
}
