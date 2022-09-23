package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Ali";
		ogrenciler[1]="İpek";
		ogrenciler[2]="Deniz";
		ogrenciler[3]="Faruk";
		
		for(int i =0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
