package backup;

import java.util.*;

//https://www.acmicpc.net/problem/11720
public class P11720 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String number = input.next();
		int sum=0;
		
		for(int i=0; i<num;i++){
			sum+=(Character.getNumericValue(number.charAt(i)));
		}
		
		System.out.println(sum);
	}

}
