package Game;

/*
 * http://acm.hdu.edu.cn/showproblem.php?pid=1846
 */

import java.util.Scanner;

public class BraveGame {
	public static String fun1(int n, int m){
		int s = n%(m+1);
		if(s == 0)
			return "second";
		return "first";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ss = new String[n];
        for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                ss[i] = fun1(a,b);
        } 
        for(int j=0;j<n;j++)
        	System.out.println(ss[j]);

	}

}
