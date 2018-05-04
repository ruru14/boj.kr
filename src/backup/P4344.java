package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/4344
public class P4344 {


	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(read.readLine());
		double[] avg = new double[testCase];
		StringTokenizer token;
		int member;
		double[] score;
		int sum;
		int flag;
		double[] overAvg = new double[testCase];
		
		for(int i=0; i<testCase; i++){
			token = new StringTokenizer(read.readLine(), " ");
			member = Integer.parseInt(token.nextToken());
			score = new double[member];
			sum = 0;
			flag = 0;
			for(int j=0; j<member; j++){
				score[j] = Double.parseDouble(token.nextToken());
				sum += score[j];
			}
			avg[i] = (double)sum/member;
			for(int k=0; k<member; k++){
				if(score[k]>avg[i]){
					flag ++;
				}
			}
			overAvg[i] = (double)flag/member * 100;
			write.write(String.format("%.3f", overAvg[i]));
			write.write("%");
			write.newLine();
		}
		
		
		write.flush();
		read.close();
		write.close();
	}
}
