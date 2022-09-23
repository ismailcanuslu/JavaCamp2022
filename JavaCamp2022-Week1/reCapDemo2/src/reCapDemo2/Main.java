package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 2.2, 3.3, 1.4, 1.5 };

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}

		System.out.println("-----------");

		for (double number : myList) {
			System.out.println(number);

		}

		double total = 0;
		for (double elemanSayisi : myList) {
			total = total + elemanSayisi;
			System.out.println(elemanSayisi);
		}

		System.out.println("Toplam = " + total);

		System.out.println("-------");

		double total2 = 0;
		for (int j = 0; j < myList.length; j++) {
			total2 = total2 + myList[j];
		}
		System.out.println("Toplam2=" + total2);

		System.out.println("------");

		double total3 = 0;
		for (double herseyOlur : myList) {
			total3 = total3 + herseyOlur;
		}
		System.out.println("toplam3:" + total3);
		
		double max = 0;
		
		for(double number:myList){
			if(max<number) {
				max = number;
			}
		}
		System.out.println(max);
		
		double min = myList[0];
		
		for(double check:myList) {
			if(min>check) {
				min = check;
			}
		}
		System.out.println(min);

	}

}
