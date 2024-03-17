package observer_design_pattern;

//Subject'imiz müşterileri temsil etmektedir.
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
