package Proje_03;

public class Runner {
    public static void main(String[] args) {
        double hesapBakiyesi=5;
        Urun urun=new Urun();
       // System.out.println(urun.toString());
        Options options=new Options();
       // options.select(urun);
        urun.setPrice(options.select(urun));
       hesapBakiyesi= options.balance(urun.getPrice(), hesapBakiyesi, urun);
      //  System.out.println(hasapBakiyesi);
    }
}
