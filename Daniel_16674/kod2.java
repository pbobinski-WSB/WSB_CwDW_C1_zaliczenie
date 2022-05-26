package w10;

import java.util.Scanner;

public class kod2 {

	public static void main(String[] args) 
	{
		Scanner skan = new Scanner(System.in);
		System.out.print("Podaj pierwsza liczbe: ");
		int input1 = skan.nextInt();
		System.out.print("Podaj druga liczbe: ");
		int input2 = skan.nextInt();
		int output = input1 + input2;
		System.out.println(input1 + " + " + input2 + " = " + output);
		System.out.println("Zmiana #2");
	}

}
