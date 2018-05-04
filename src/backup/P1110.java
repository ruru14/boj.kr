package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/1110
public class P1110 {

	public static int combine(int a, int b){
		StringBuffer buf = new StringBuffer();
		buf.append(a).append(b);
		int returnNum = Integer.parseInt(buf.toString());
		
		return returnNum;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(read.readLine());
		int cycle = 0;
		int fNum = 0;
		int sNum = 0;
		int resultNum = -1;
		int temp = number;
		while (number != resultNum) {
			cycle++;
			if (temp < 10) {
				fNum = 0;
				sNum = temp;
			} else {
				fNum = temp / 10;
				sNum = temp % 10;
			}
			resultNum = combine(sNum, (fNum + sNum)%10);
			temp = resultNum;
		}
		
		write.write(Integer.toString(cycle));
		
		write.flush();
		read.close();
		write.close();
	}
}
