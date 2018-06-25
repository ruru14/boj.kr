package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/10039
public class P10039 {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = 0;
		int score = 0;
		
		for(int i=0; i<5; i++){
			input = Integer.parseInt(read.readLine());
			if(input<40)
				score += 40;
			else
				score += input;
		}
		
		write.write(Integer.toString(score/5));

		write.flush();
		write.close();
		read.close();
	}
}
