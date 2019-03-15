package Permutation;

/**
 * 打印没有重复数字的全排列
 * 比如说：123，那么打印出
 * 123 132 213 231 312 321
 * @author YangXian
 *
 */

public class Permutation1 {
	//利用递归
	public static void pailie(int n, int[] nums){
		if(n == nums.length-1){//递归出口
			for(int j =0;j<nums.length;j++)
				System.out.print(nums[j]);
			System.out.println();
		}else{
			for(int i=n;i<nums.length;i++){
				swap(i,n,nums);
				pailie(n+1,nums);
				swap(i,n,nums);
			}
		}
	}
	//交换两个数的位置
	public static void swap(int i,int j,int[] nums){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		pailie(0,nums);

	}

}
