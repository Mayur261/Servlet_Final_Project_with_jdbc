package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoanDAO {
    private Connection connection;

    public LoanDAO(Connection connection)
    {
        this.connection = connection;
    }

    public boolean insertLoanData(
        String name,
        String number,
        String address,
        String location,
        String company,
        String loanAmount,
        String disbursementAmount,
        String emi,
        String remark
    ) {
        String sql = "INSERT INTO loan_information (name,number,address,location,company_name,loan_amount, disbursement_amount,emi,remark) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, number);
            statement.setString(3, address);
            statement.setString(4, location);
            statement.setString(5, company);
            statement.setString(6, loanAmount);
            statement.setString(7, disbursementAmount);
            statement.setString(8, emi);
            statement.setString(9, remark);

            int rowsInserted = statement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
