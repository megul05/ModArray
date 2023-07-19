package ModArray;

import java.util.*;

public class ModArray {
	public static int modarray(int[] arr,int p)
	{
		int power=1;
		int result =0;
		for(int i=arr.length-1;i>=0;i--)
		{
			result = (result + ((arr[i]%p)*power))%p;
			power = (power *10)%p;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.nextLine();
		int p = scan.nextInt();
		int print = modarray(arr,p);
		System.out.println(print);

	}

}
