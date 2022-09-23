package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		//220-284
		int number1= 220;
		int number2= 284;
		
		int check1=0;
		int check2=0;
		
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<number1;i++) {
			check1 = number1 % i;
			if(check1==0){
				toplam1 = toplam1 + i;
			}
		}
		for(int j=1;j<number2;j++) {
			check2 = number2 % j;
			if(check2==0){
				toplam2 = toplam2 + j;
			}
		}
		if(toplam1==number2&&toplam2==number1){
			System.out.println("Bu sayılar arkadaş sayıdır.");
		}else {System.out.println("Bu sayılar arkadaş sayı değildir.");}

	}

}
