package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 23;
		

		for (int i = 1; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				System.out.println("Aradığın sayı var.");
				return;
			}
				
			}
		System.out.println("Aradığın sayı yok.");
		}
		
	}


