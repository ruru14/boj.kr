package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1546
public class P1546 {


	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int subject = Integer.parseInt(read.readLine());
		StringTokenizer input = new StringTokenizer(read.readLine(), " ");
		double[] score = new double[subject];
		double temp=0;
		double highScore = 0;
		double mean = 0.00;
		
		for(int i=0; i<subject; i++){
			score[i] = Double.parseDouble(input.nextToken());
		}
		
		for(int i=0; i<subject; i++){
			if(highScore < score[i]){
				highScore = score[i];
			}
		}
		
		for(int i=0; i<subject; i++){
			score[i] = score[i] / highScore	* 100;
		}
		
		for(int i=0; i<subject; i++){
			mean += score[i];
		}
		
		mean /= subject;
		
		write.write(String.format("%.2f", mean));
		
		write.flush();
		read.close();
		write.close();
	}
}
