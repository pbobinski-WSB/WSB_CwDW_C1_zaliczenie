
import java.util.Random;

public class zad3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(16);
		int y = rand.nextInt(16);
		System.out.println("Wylosowane liczby: "+x+" i "+y);
		
		if(x>y) {
			System.out.println("Pierwsza liczba jest wiêksza.");
		}else if(y>x) {
			System.out.println("Druga liczba jest wiêksza.");
		}else System.out.println("Liczby s¹ równe.");

	}

}
