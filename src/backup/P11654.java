package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/11654
public class P11654 {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = new String(read.readLine());
		
		int output = (int)input.charAt(0);
		
		write.write(Integer.toString(output));

		write.flush();
		write.close();
		read.close();
	}
}
