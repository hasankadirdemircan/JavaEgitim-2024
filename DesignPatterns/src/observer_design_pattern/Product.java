package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private String productName;
    private boolean available;
    private List<Observer> listOfObservers = new ArrayList<>();

    //üründen haber almak isteyen müşteriyi ekler( takipçi gibi, gözlemci olarak;)
    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    //üründen haber almaktan vazgeçen müşteriyi siler.
    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    //ürünün DURUMU ile ilgili değişkliği haber bekleyen müşterilere bildirir.
    @Override
    public void notifyObservers() {
        System.out.println("Haberdar olmak isteyen müşterilere ürün geldiğinde haber vermektedir.");
        for(Observer observer : listOfObservers) {
            observer.update(productName);
        }
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //ürünün varolup/olmadığı bilgisini döner
    public boolean isAvailable() {
        return available;
    }

    //ürünün durumunu günceller.
    public void setAvailable(boolean available) {
        this.available = available;
        if(available) {
            notifyObservers();
        }
    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }
}
