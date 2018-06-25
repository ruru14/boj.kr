package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/8958
public class P8958 {

	public static int solve(String input){
		int flag = 0;
		int score = 0;
		
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)=='O'){
				flag++;
				score += flag;
			}else{
				flag = 0;
			}
		}
		
		return score;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(read.readLine());
		int[] result = new int[testCase];
		
		for(int i=0; i<testCase; i++){
			result[i] = solve(read.readLine());
		}
		
		for(int i=0; i<testCase; i++){
			write.write(Integer.toString(result[i]));
			write.newLine();
		}
		
		
		write.flush();
		write.close();
		read.close();
	}
}
