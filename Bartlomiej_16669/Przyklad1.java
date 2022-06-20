import java.util.Random;
//zmiana pliku2
public class Zad1 {

	public static void main(String[] args) {
		Random los=new Random();
	double dzielenie=0;
	
		int tab[]=new int [15];
		System.out.println("Wygenerowana tablica:");
		for(int i=0;i<20;i++) {
			tab[i]=los.nextInt(100);
			System.out.println(tab[i]);
			//System.out.println("(podzielone przez 2)= "+tab[i]/2);
		}
		System.out.println("Po podzieleniu przez 2:");
		int tab2[]=new int[15]; 
		for(int j=0;j<20;j++) {
		System.out.println(tab[j]/2);
		}
	}

}