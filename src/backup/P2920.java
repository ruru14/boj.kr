package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/2920
public class P2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer input = new StringTokenizer(read.readLine(), " ");
		int flag = 0;
		
		int[] number = new int[8];
		int initFlag = 0;

		while(input.hasMoreTokens()){
			number[initFlag++] = Integer.parseInt(input.nextToken());
		}
		
		for(int i=0; i<5; i++){
			if((number[i]-number[i+1]) == (number[i+2]-number[i+3])){
				if((number[i]-number[i+1])>0){
					flag--;
				}else{
					flag++;
				}
			}
			else{
				flag = 0;
				break;
			}
		}
		
		if(flag == 0){
			write.write("mixed");
		}else if(flag >0){
			write.write("ascending");
		}else{
			write.write("descending");
		}
		
		write.flush();
		write.close();
		read.close();
	}
}
