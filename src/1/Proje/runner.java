package Employe;

public class runner {
    public static void main(String[] args) {

    Employe.Employee employee = new Employe.Employee("Drake",20000,41,2020);
    System.out.println("Name: " + employee.name);
    System.out.println("Maas: " + employee.salary);
    System.out.println("Odenecek Vergi: " + employee.tax() + "₺");
    System.out.println("Odenecek Bonus: " + employee.bonus() + "₺");
    System.out.println("Maaş Artışı: " + employee.raiseSalary() + "₺");

    System.out.println("Toplam Odenecek Ucret: " + ((employee.salary) + (employee.raiseSalary())));

    System.out.println(employee.toString());


}}
