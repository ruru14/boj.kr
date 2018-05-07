package backup;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/4673
public class P4673 {

	public static int NextNumber(int number){
		int nextNum = number;
		StringTokenizer token = new StringTokenizer(Integer.toString(nextNum), "1234567890", true);
		while(token.hasMoreTokens())
			nextNum += Integer.parseInt(token.nextToken());
		
		return nextNum;
	}

	public static void main(String[] args) throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1; i<10001; i++)
			list.add(i);
		
		for(int i=1; i<10001; i++){
			if(NextNumber(i)<=10000)
				list.remove(new Integer(NextNumber(i)));
		}
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
