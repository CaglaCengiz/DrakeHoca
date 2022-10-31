package Proje_01;

public class Employee { /*
        TASK - >
                Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
        ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
        şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
                Bunun için;
        1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (data type->LocalDateTime )
        2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
        create ederek Kullanıcı Class'dan user ismini(name) alarak ArrayList e ekleyin ve bu list i
        return edin.
        3- Registration(Kayıt) classı na aynı zamanda kendine verilen(parametre)
                ArrayListteki userlardan(kullanıcı obj) her dakikanın ilk 10  saniyesinde kaydolanları
        yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod create ediniz


        Obj ile uyglamayı run ediniz


        İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.

        public static void main(String[] args) {
            Kayıt yeniKayıt = new Kayıt();
            ArrayList<Kullanıcı> kisi = yeniKayıt.kayıtAl();
            yeniKayıt.sanslıKullanıcı(kişi); */
    String name;
    int salary;
    int workHours;
    int year;

    public Employee(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                '}';
    }
    public double vergiHesapla(){
        double vergi=0;

        if(salary<10000){
            vergi=0;
        }else if(salary<15000)
        {vergi=(salary*0.03);}
        else vergi=(salary*0.08);


        return vergi;
    }
    public int ekMesai() {
        int ekMesaiMiktar=0;
        int saatlikMesaiUcret=50;
        if (workHours>40){
            ekMesaiMiktar=(workHours-40)*saatlikMesaiUcret;
        }
        return ekMesaiMiktar;
    }

    public double maasArtisi()  {
        int gunumuz=2022;
        int calismaSuresi=(gunumuz-year);
        double artis=0;
        if(calismaSuresi<5){
            artis=(salary+vergiHesapla())*0.05;
        }
        else if(calismaSuresi<15){
            artis=(salary+vergiHesapla())*0.10;
        }
        else artis=(salary+vergiHesapla())*0.20;

        return artis;
    }

    public double toplamMaas(){
        double toplamMaas=(maasArtisi()+ekMesai())+salary;

        return toplamMaas;
    }



}
