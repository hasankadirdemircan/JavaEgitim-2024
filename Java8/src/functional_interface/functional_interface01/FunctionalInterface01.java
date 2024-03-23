package functional_interface.functional_interface01;

@FunctionalInterface
public interface FunctionalInterface01 {
    public void abstractMethod();
    /*
    1 tane abstract mehhod olmalı.
    1 den az veya fazla olursa compiler hatası verir.
    ve @FunctionalInterface anatasyonunu kaldırmamız gerekir
     */
  //  public void abstractMethod2();
}
