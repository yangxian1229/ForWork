package Permutation;

/**
 * 给定一个数组（有重复数字）写出数组的全排序
 * 比如：1123
 * @author YangXian
 *
 */

public class Permutation2 {
	//交换两个数的位置
	public static void swap(int i,int j,int[] nums){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	//判断是否当前位置的数值是否与前面的重复
	public static Boolean isRepeat(int i,int j,int[] nums){
		for(int k=0;k<i;k++){
			if(nums[k] == nums[j])
				return false;
		}
		return true;
	}
	
	public static void permutation(int beg,int[] nums){
		if(beg == nums.length-1){
			for(int j =0;j<nums.length;j++)
				System.out.print(nums[j]);
			System.out.println();
		}else{
			for(int i=beg;i<nums.length;i++){
				if(!isRepeat(i,beg,nums)){
					swap(i,beg,nums);
					permutation(beg+1,nums);
					swap(i,beg,nums);
				}
			}
			
		}
	}
		

	public static void main(String[] args) {
		int[] nums = {1,1,2,3};
		permutation(0,nums);

	}

}
