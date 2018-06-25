package backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//https://www.acmicpc.net/problem/2448
//cannot solved
public class P2448 {


	public static char[][] star ={
			{'0','0','*','0','0'},
			{'0','*','0','*','0'},
			{'*','*','*','*','*'}
	};
	
	char[][] array = new char[3072][6143];
	
	public static void Star(int num){
		if(num==1){
			
		}
		
		else{
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		int floor = Integer.parseInt(read.readLine());
		
		Star(floor/3);

		char[][] a = {{'1','2'},{'3','4'}};
		
		for(int i=0; i<3;i++){
			for(int j=0; j<5; j++){
				System.out.println(star[i][j]);
			}
		}
		
		write.flush();
		write.close();
		read.close();
	}
}
