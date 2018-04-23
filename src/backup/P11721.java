package backup;

import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11721
public class P11721 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		StringBuffer buf = new StringBuffer(sentence);		
		int j=0;
		
		for(int i=1; i<(sentence.length()/10)+1;i++){
			buf.insert(10*i+(j++), ";");
		}
		
		StringTokenizer token = new StringTokenizer(buf.toString());
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken(";"));
		}
		
	}
}
