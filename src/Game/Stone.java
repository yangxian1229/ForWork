package Game;

/*
 * http://poj.org/problem?id=1067
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Stone {
	public static int fun2(int a,int b){
		//调整a,b的位置
		if(a > b){
			int temp = b;
			b = a;
			a = temp;
		}
		int k = b-a;
		double genhao = Math.sqrt(5.0);
		int a_k = (int) (k*(genhao+1)/2);
		if(a != a_k)
			return 1;
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(fun2(a,b));
		}
		
			

	}

}
