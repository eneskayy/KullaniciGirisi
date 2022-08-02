import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword, sifirlama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı :");
        userName = inp.nextLine();

        System.out.print("Şirfreniz : ");
        password = inp.nextLine();


        if (userName.equals("enes") && (password.equals("enes1212"))) {
            System.out.println("Giriş Başarılı : ");
        } else {
            System.out.println("Hatalı giriş. Yeni şifre isterseniz \"yes\" istemezseniz \"no\" seçin");
            sifirlama = inp.nextLine();


            if (sifirlama.equals("no")) {
                System.out.println("Giriş Yapılamadı !");

            } else if (sifirlama.equals("yes")) {
                System.out.println("Yeni şifre girin : ");
                newPassword = inp.nextLine();

                if (newPassword.equals("enes1212")) {
                    System.out.println("Şifreniz son 3 şifrenizle aynı olamaz !");

                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi !");
                }
            }


        }


    }
}
