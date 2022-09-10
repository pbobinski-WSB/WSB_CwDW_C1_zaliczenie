
public class zad3 {

	public static void main(String[] args) {
		
		System.out.println("Liczenie sumy");
		int suma=0;
		System.out.println("Suma z liczb: ");
		for(int i=1; i<=15; i++)
		{
			suma+=i*3;
			System.out.print(i*3+" ");
		}
		System.out.println("\nto: "+suma);
		System.out.println("\nKoniec");
	}

}
