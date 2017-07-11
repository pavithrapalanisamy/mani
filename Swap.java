package Guvi;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the first no : ");
		a=s.nextInt();
		System.out.println("Enter the second no : ");
	    b=s.nextInt();
		 temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a+" "+b);
		s.close();
	}

}
