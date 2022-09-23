package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='Y';
		
		if(harf=='A'||harf=='O'||harf=='U'||harf=='I'){
			System.out.println("İF:Kalın sesli harftir.");
		}else if(harf=='E'||harf=='Ö'||harf=='Ü'||harf=='İ'){
			System.out.println("İF:İnce sesli harftir.");
		}else{
			System.out.println("İF:Geçersiz harf.");
		}
		
		switch(harf){
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("SW:Kalın sesli harf girdiniz.");
			return;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("SW:İnce sesli harf girdiniz.");
			return;
		default:
			System.out.println("SW:Geçersiz harf.");
		}
		
			
		
		
			
	}

}
