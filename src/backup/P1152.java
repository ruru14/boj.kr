package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1152
public class P1152 {

	
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer input = new StringTokenizer(read.readLine(), " ");
		int count = 0;
		
		while(input.hasMoreTokens()){
			input.nextToken();
			count++;
		}
		
		write.write(Integer.toString(count));
		
		write.flush();
		write.close();
		read.close();
	}
}
