import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    //TODO: postgresql'e bir table oluşturun, içerisinde age, name gibi gibi column'lar olsun.
    //daha sonrasında java tarafında bir maven proje oluşturun, posgresql dependency ekleyin.
    //Scanner kullanarak kullanıcdan bu column bilgilerini alınız: age griniz: name giriniz:
    //alınan bu bilgileri oluşturduğun table'a INSERT ediniz.

    //INSERT ettikten sonra başka bir class'da bu değerleri SELECT ile okuyup, bir tane txt dosyasına yazınız. (mesela customer.txt)
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/firstdb";
        String username = "postgres";
        String password = "123456";

        try {
            //veritabanı bağlantı oluşturma
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            /*
            INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (998, 'a', 'b', 'c', 'd', 'e', 'f')
             */
            //INSERT
            String insertSQL = "INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
            insertStatement.setInt(1, 999);
            insertStatement.setString(2, "hasan");
            insertStatement.setString(3, "hkd");
            insertStatement.setString(4, "etimesgut");
            insertStatement.setString(5, "ankara");
            insertStatement.setString(6, "123");
            insertStatement.setString(7, "TR");
            int affectedRow = insertStatement.executeUpdate(); //DELETE INSERT UPDATE
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);
            System.out.println();
            connection.close();;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
