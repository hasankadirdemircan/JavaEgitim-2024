package observer_design_pattern;

public class Main {

    public static void main(String[] args) {
        Customer utku = new Customer();
        utku.setCustomerName("utku");

        Customer hasan = new Customer();
        hasan.setCustomerName("hasan");

        Customer yaren = new Customer();
        yaren.setCustomerName("yaren");

        Product iphone7 = new Product();
        iphone7.setProductName("iphone7");
        iphone7.setAvailable(false);

        //iphone7 geldiğinde bildirim almak isteyen kişiler register olcak.
        iphone7.registerObserver(utku);
        iphone7.registerObserver(yaren);

        //ürün gelmiş olsun.
        iphone7.setAvailable(true);


        //ürün bitti
        iphone7.setAvailable(false);

        //utku satın aldığı için takipten çıksın ürünü
        iphone7.removeObserver(utku);

        //hasan da kayıt olsun
        iphone7.registerObserver(hasan);

        //ürün tekrar geldi
        iphone7.setAvailable(true);
    }
}
