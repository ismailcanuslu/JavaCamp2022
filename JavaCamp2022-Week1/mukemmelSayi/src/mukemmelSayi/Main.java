package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6----->1,2,3
		//28---->1,2,4,7,14
		//Bir sayı mükemmel sayı mı değil mi bul.
		int number=28;
		//change number
		int total= 0;
		int kalan= 0;
		int i=0;
		
		for(i=1;i<number;i++) {
			kalan = number % i;
			if(kalan==0){
				total = total + i;
			}
		}
		if(total==i) {
			System.out.println("Mükemmel sayı buldunuz.");
		}else {
			System.out.println("Sayı mükemmel değil.");
		}

	}

}
