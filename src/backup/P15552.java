package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/15552
public class P15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(input.readLine());
		String twoNum = new String();
		StringTokenizer parse;
		int[] ans = new int[count];
		int a = 0, b=0;
		
		for(int i=0; i<count; i++){
			twoNum = input.readLine();
			parse = new StringTokenizer(twoNum, " ");
			a = Integer.parseInt(parse.nextToken());
			b = Integer.parseInt(parse.nextToken());
			ans[i] = a+b;
		}
		
		for(int j=0; j<count; j++){
			write.write(Integer.toString(ans[j]));
			write.newLine();
		}

		write.flush();
		input.close();
		write.close();
	}
}
