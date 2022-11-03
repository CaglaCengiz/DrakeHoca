package Proje_02;

import java.util.Scanner;

public class EmailApp { /* İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
           --> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
   Nitelikler:
   firtsName: Çalışan İsmi
   lastName: Çalışan soyadı
   passWord: Çalışan şifresi
   department: Çalışılacak Departman
   email: Çalışan Email
   emailSuffix: Şirket Domaini (clarusway.com)
   mailBoxCapasity : 1000
   defaultpassWordLenght : 12
   Metotlar:
   Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
   setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır. Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
           testautomation.
                   fullstackdeveloper.
                   salesforce.
                   hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)
   setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır. Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir. ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
   showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.

   **java otomatik mail attıran code google la
   */
    String firtsName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com";//sirket Domaini @
    double mailBoxCapasity = 1000;
    int defaultpassWordLenght = 12;

    public EmailApp(String firtsName, String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;

        this.department = setDepartment();
       // System.out.println("Department:"+ department);
        this.passWord=setRandomPassWord(defaultpassWordLenght);
       // System.out.println(passWord);
        email=firtsName.toLowerCase()+lastName.toLowerCase()+"@" + department +emailSuffix;
    }

    public String setDepartment() {
        System.out.print("Lutfen asağıda belirtilen departmanlardan birini seçiniz ...\n" +
                "\n1 Test Automation \n2 Full Stack Developer\n3 Salesforce \n0 Hiçbiri  ");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        if (options == 1) {
            return " Test Automation.";

        } else if (options == 2) {
            return "Full Stack Developer.";
        } else if (options == 3) {

            return " Salesforce.";
        } else {
            return "";
        }
    }

    // int lenght=12;
    public String setRandomPassWord(int lenght) {
        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());

            password[i] = passWordSet.charAt(random);


        }
return new String(password);

    }
    public String showInfo(){
return "Ad-Soyad :"+firtsName+ " "+ lastName +"\n"+
        "SirketEmail:"+email+"\n"+
        "Capasity:"+ mailBoxCapasity +"mb \n"+
        "Password:" +passWord;

    }

}
  






