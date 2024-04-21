import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TODO: Veritabanını ve tabloları direkt pgAdmin üzerinden oluşturabilirsiniz.
// Bir adet customers table olsun
// Bir adet products table olsun
// Bir adet orders table olsun. (order_id, customer_id, product_id)
// bu tablolara kayıtları Java ile atınız.
// INNER JOIN ile bir customer'ın sipariş ettiği ürünleri göstersin (Scanner ile customer_id kullanıcıdan alınsın.)
// tüm ürünleri listeleyelim (sout)
// silinmesini istediğimiz bir category var ise; category silindikten sonra products tablosundan da o category'e ait ürünler silinmeli.
// burada lütfen ayırabildiğiniz kadar class ve method'lara ayırınız. try-with-resource kullanmayı unutmayınız.
public class Update {
    public static void main(String[] args) {
        String updateSql = "Update products SET price = ?  where product_name = ?";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try(Connection connection = dbConnection.getConnection();
            PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
            updateStatement.setDouble(1, 20.00);
            updateStatement.setString(2, "Chais");
            int affectedRows = updateStatement.executeUpdate();
            System.out.println("UPDATE işleminden etkilenen satır(row) sayısı : " + affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
