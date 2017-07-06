package Guvi;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<n;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);

	}

}
