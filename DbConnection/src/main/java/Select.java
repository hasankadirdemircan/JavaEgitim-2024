import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/firstdb";
        String username = "postgres";
        String password = "123456";

        try {
            //veritabanı bağlantı oluşturma
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            //SELECT işlemi
            String selectSQL = "SELECT * FROM customers";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery(); //SELECT
            while(resultSet.next()) {
                //Db'den gelen sonuçları al
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String country = resultSet.getString("country");
                String postalCode = resultSet.getString("postal_code");
                System.out.println("customer_id : " + customerId);
                System.out.println("customer_name : " + customerName);
                System.out.println("country : " + country);
                System.out.println("postal_code : " + postalCode);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
