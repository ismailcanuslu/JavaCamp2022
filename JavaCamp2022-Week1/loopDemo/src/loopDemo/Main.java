package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");

		int i = 1;
		// While
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		
		int j=1;
		//do while
		do{
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti");
	}

}