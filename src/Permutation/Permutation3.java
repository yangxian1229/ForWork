package Permutation;

import java.util.Arrays;

/**
 * 给定一个排序，输出他的下一个字典排序
 * 比如说：1432
 * 输出：2134
 * @author YangXian
 *
 */

public class Permutation3 {
	/**
	 * 从右往左看，找到他降序的第一个数字，然后将右边最小的与它交换，然后将右边的进行逆序输出
	 * @param nums
	 */
	public static int[] printNextPermutation(int[] nums){
		for(int i=nums.length-1;i>0;i--){
			if(nums[i]>nums[i-1]){
				int k=i-1;
				int temp = nums[k];
				Arrays.sort(nums,k,nums.length);//从改变位起，从小到大排序
				
				while(temp != nums[k]){
					k++;
				}
				temp = nums[k+1];
				while(k >= i-1){//找到提前的数字取出，调整序
					nums[k+1] = nums[k];
					k--;
				}
				nums[i-1] = temp;
				
				return nums;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,5,4,2};
		int[] nums1 = printNextPermutation(nums);
		for(int i=0;i<nums1.length;i++){
			System.out.print(nums[i]);
		}

	}

}
