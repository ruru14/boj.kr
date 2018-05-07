package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1065
public class P1065 {

	public static boolean isSequence(int number){
		if(number<100)
			return true;
		
		StringTokenizer token = new StringTokenizer(Integer.toString(number), "0123456789", true);
		int[] parseNum = new int[4];
		
		for(int i=0; i<Integer.toString(number).length(); i++)
			parseNum[i] = Integer.parseInt(token.nextToken());
		
		int temp = parseNum[1] - parseNum[0];
		
		for(int i=0; i<Integer.toString(number).length()-1; i++){
			if((parseNum[i+1] - parseNum[i]) != temp)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(read.readLine());
		int count = 0;
		
		for(int i=1; i<number+1; i++){
			if(isSequence(i))
				count++;
		}
		
		write.write(Integer.toString(count));
		
		write.flush();
		write.close();
		read.close();
	}
}
