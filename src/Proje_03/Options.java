package Proje_03;

import java.util.Scanner;

public class Options {


    /*
    1)kullanıcıya urunleri göstermeliyiz.>urun clasın da bir obj. toStrıng()
    2)Scanner> Scanner clasından bir obje creata ediniz[prodeckNum a set edilmeli .setProductNum()]
    3)Loop > do -while Loop >kullanıcı 1-7 rakamları arsında seçim yapmalı ve eger girmiş olduğu rakam 1den
    kucuk veya 7 den buyuk ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim apmay force edilmeli
    4) 0 abasark da menuden çıkabilmeli >yine bekleriz yazısını konsola yazdıralım
    5)kullanıcıdan prodectNum (1-7 arasında rakam )
    6)switch benden ProdeckNum ve alınan bu prodeckNum a göre ilgili urunün price ı alınmalı.getKracer()...
    (price set edbilmek için ben price ın setPrıce()methodunu kullanmalıyım
    7)return olarak bana price donmeli .return getPrice() (double)
     */
    public double select(Urun urun) {
        System.out.println(urun.toString());//kullanıcıya urunleri gösterelim
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("urun numarasını giriniz");
            System.out.println("cıkış için '0' ");
            urun.setProductNum(scan.nextInt());
            if (urun.getProductNum() < 0 || urun.getProductNum() > 7) {
                System.out.println("lutfen belirtilen aralıkta bir rakam giriniz");
            }

        } while (urun.getProductNum() < 1 || urun.getProductNum() > 7);
        switch (urun.getProductNum()) {
            case 0:
                System.out.println("yıne bekleriz");
                break;

            case 1:
                urun.setPrice(urun.getKraker());
                break;
            case 2:
                urun.setPrice(urun.getCips());
                break;
            case 3:
                urun.setPrice(urun.getCocaCola());
                break;
            case 4:
                urun.setPrice(urun.getFanta());
                break;
            case 5:
                urun.setPrice(urun.getSu());
                break;
            case 6:
                urun.setPrice(urun.getCay());
                break;
            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;
        }


        return urun.getPrice();
    }

    public double balance(double price, double hesapBakiyesi, Urun urun) {
        double fonlama;
        while (hesapBakiyesi<price){
            Scanner scan=new Scanner(System.in);
            System.out.println("yeterli bakiyenız bulunmamaktadır ..Ekleme yapmak istiyormusunuz(Y/N)");
            char onayla=scan.next().toLowerCase().charAt(0);
            if(onayla=='n') {
                System.out.println("mevcut bakiyeniz: " + hesapBakiyesi);
                System.out.println("yine bekleriz");
                break;
            }else {
                System.out.println("ne kadar ekleme yapmak istiyorsunuz");
                fonlama=scan.nextDouble();
                hesapBakiyesi =hesapBakiyesi+fonlama;
                System.out.println("yeni bakiyeniz" + hesapBakiyesi);





            }
        }

        return hesapBakiyesi;
    }
}