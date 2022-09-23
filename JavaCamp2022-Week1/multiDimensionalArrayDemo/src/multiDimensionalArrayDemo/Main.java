package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Çanakkale";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Eskişehir";
		sehirler[1][2] = "Konya";
		sehirler[2][0] = "Samsun";
		sehirler[2][1] = "Sinop";
		sehirler[2][2] = "Ordu";
		
		for(int i=0;i<=2;i++){
			System.out.println("----------------------");
			for(int j=0;j<=2;j++){
				System.out.println(sehirler[i][j]);
			}
			
		}
	}

}
