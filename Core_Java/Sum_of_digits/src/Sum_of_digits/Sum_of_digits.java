package Sum_of_digits;

import java.util.*;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		while(a!=0) {
			int temp = a%10;
			sum +=temp;
			a/=10;
		}
		System.out.println(sum);
	}

}
