package Game;


/**
 * http://acm.hdu.edu.cn/showproblem.php?pid=1847
 * @author YangXian
 *
 */
import java.util.Scanner;

public class GoodLuck {
	public static String fun3(int a){
		int m = a%3;
		if(m == 0)
			return "Cici";
		return "Kiki";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int a = in.nextInt();
			System.out.println(fun3(a));
		}

	}

}
