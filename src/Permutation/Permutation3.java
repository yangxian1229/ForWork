package Permutation;

import java.util.Arrays;

/**
 * ����һ���������������һ���ֵ�����
 * ����˵��1432
 * �����2134
 * @author YangXian
 *
 */

public class Permutation3 {
	/**
	 * �������󿴣��ҵ�������ĵ�һ�����֣�Ȼ���ұ���С������������Ȼ���ұߵĽ����������
	 * @param nums
	 */
	public static int[] printNextPermutation(int[] nums){
		for(int i=nums.length-1;i>0;i--){
			if(nums[i]>nums[i-1]){
				int k=i-1;
				int temp = nums[k];
				Arrays.sort(nums,k,nums.length);//�Ӹı�λ�𣬴�С��������
				
				while(temp != nums[k]){
					k++;
				}
				temp = nums[k+1];
				while(k >= i-1){//�ҵ���ǰ������ȡ����������
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
