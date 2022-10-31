package Proje_01;

public class Runner { public static void main(String[] args) {

    Employee Emp1=new Employee("Simten",10000,50,2010);

    System.out.println(Emp1);


    System.out.println("Emp1.maasArtisi() = " + Emp1.maasArtisi());
    System.out.println("Emp1.ekMesai() = " + Emp1.ekMesai());
    System.out.println("Emp1.toplamMaas() = " + Emp1.toplamMaas());


    System.out.println("Emp1.vergiHesapla() = " + Emp1.vergiHesapla());
}
}
