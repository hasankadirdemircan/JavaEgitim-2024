import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    //TODO: postgresql'e bir table oluşturun, içerisinde age, name gibi gibi column'lar olsun.
    //daha sonrasında java tarafında bir maven proje oluşturun, posgresql dependency ekleyin.
    //Scanner kullanarak kullanıcdan bu column bilgilerini alınız: age griniz: name giriniz:
    //alınan bu bilgileri oluşturduğun table'a INSERT ediniz.

    //INSERT ettikten sonra başka bir class'da bu değerleri SELECT ile okuyup, bir tane txt dosyasına yazınız. (mesela customer.txt)
    public static void main(String[] args) {

        PostgreDbConnection dbConnection = new PostgreDbConnection();
        String insertSQL = "INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (?, ?, ?, ?, ?, ?, ?)";
        //veritabanı bağlantı oluşturma
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertStatement = connection.prepareStatement(insertSQL)) { //try-with-resource
            /*
            INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (998, 'a', 'b', 'c', 'd', 'e', 'f')
             */
            //INSERT
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
