package Game;

/**
 * http://acm.hdu.edu.cn/showproblem.php?pid=2147
 * @author YangXian
 */

import java.util.Scanner;

public class KikiGame {
	
	public static String fun4(int n, int m){
		if((n&1) !=0 && (m&1) !=0)
			return "What a pity!";
			
		return "Wonderful!";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			if(a == 0 && b==0){
				
			}else{
				System.out.println(fun4(a,b));
			}
		}
		in.close();

	}

}
