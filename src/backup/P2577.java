package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//https://www.acmicpc.net/problem/2577
public class P2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(read.readLine());
		int B = Integer.parseInt(read.readLine());
		int C = Integer.parseInt(read.readLine());
		int result = A*B*C;
		
		String num = Integer.toString(result);
		
		int[] output = {0,0,0,0,0,0,0,0,0,0};
		

		for(int i=0; i<num.length(); i++){
			output[Integer.parseInt(Character.toString(num.charAt(i)))]++;
		}
		
		for(int i=0; i<10; i++){
			write.write(Integer.toString(output[i]));
			write.newLine();
		}
		
		write.flush();
		write.close();
		read.close();
	}
}
