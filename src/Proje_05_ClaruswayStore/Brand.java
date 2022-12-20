package Proje_05_ClaruswayStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {
    private int id;
    private  String name;
    private static List<Brand>brandList=new ArrayList<>();
    static {
        creataBrands();

    }

    public static void printBrands() {
        System.out.println("...Marka listesi...");
        //en temelde yapmak istediğim şey--> System.out.println("BrandName");
        for (Brand brand:brandList){
            System.out.println(brand.getId() +" "+brand.getName());
        }
        System.out.println("-------------------------------------");
    }
    public  static Brand getBrand(int id) {
        for (Brand b:brandList){
            if (id==b.getId());
            return  b;
        }
        return null;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public static void creataBrands(){
        //olusturmus oldugum Liste ekleme yapıldı
        //Brand objesi olmalıydı ->new Brand(1,"CW");
       brandList.add(new Brand(1,"Samsung")) ;
       brandList.add(new Brand(2,"Lenova"));
       brandList.add(new Brand(3,"Apple"));
       brandList.add(new Brand(4,"Huwai"));
       brandList.add(new Brand(5,"Hp"));
       brandList.add(new Brand(6,"Asus"));
       brandList.add(new Brand(7,"LG"));
       brandList.add(new Brand(8,"Monster"));
       brandList.add(new Brand(9,"Casper"));
    }



    }

