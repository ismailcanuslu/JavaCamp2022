package stringDB;

import java.util.Scanner;

public class LoginRegisterStr {
	public void welcome() {
		System.out.println("Türkiye İş Bankası A.Ş.");
		System.out.println("Hoşgeldiniz.");

	}

	public static void loginRegisterStr() {
		System.out.println("1-)Mevcut Kullanıcı" + "\n2-)Yeni kullanıcı");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		while (select != 1 && select != 2) {
			System.out.println("Hatalı tuşlama yaptınız. Tekrar deneyiniz.");
			select = scan.nextInt();
		}
		if (select == 1) {
			System.out.println("-----------------------");
			System.out.println("TCKN No:");
			String tckn = scan.nextLine();
			scan.next();
			System.out.println("-----------------------");
			System.out.println("Şifre:");
			int password = scan.nextInt();
			System.out.println("-----------------------");
			if ((tckn.equals("12345678901") && password == 1234)) {
				System.out.println("Giriş başarılı" + "\nLütfen bekleyiniz...");
			} else {
				System.out.println("TCKN veya parola hatalı girildi.");
			}

		}
		if (select == 2)
			System.out.println("Yeni üyelik oluşturma işlemi geçici olarak kullanılamıyor.");
		if (select == 3) {
			System.out.println("Başarıyla çıkış yapıldı.");
		}
		scan.close();

	}

}
