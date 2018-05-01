package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10871
public class P10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer input = new StringTokenizer(read.readLine(), " ");
		int size = Integer.parseInt(input.nextToken());
		int base = Integer.parseInt(input.nextToken());
		input = new StringTokenizer(read.readLine(), " ");
		int[] sequence = new int[size];
		Integer[] list = new Integer[size * 2];
		int flag = 0;
		
		for(int i=0; i<size; i++){
			sequence[i] = Integer.parseInt(input.nextToken());
		}
		
		for(int j=0; j<size; j++){
			if(sequence[j] < base){
				list[flag++] = sequence[j];
				
			}
		}
		
		for(int k=0; k<size; k++){
			if(list[k] == null){
				break;
			}
			write.write(Integer.toString(list[k]));
			write.write(" ");
		}
		
		write.flush();
		read.close();
		write.close();
	}
}
