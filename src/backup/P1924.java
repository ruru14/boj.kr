package backup;

import java.util.*;

//https://www.acmicpc.net/problem/1924
public class P1924 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int d = input.nextInt();
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int dDay = 0;
		
		for(int i=1; i<m+1; i++){
			if(m==i){
				dDay = d%7;
				break;
			}
			else{
				d+=month[i-1];
			}
			dDay = d%7;
		}
		
		System.out.println(day[dDay]);
	}
}
