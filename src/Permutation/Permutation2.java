package Permutation;

/**
 * ����һ�����飨���ظ����֣�д�������ȫ����
 * ���磺1123
 * @author YangXian
 *
 */

public class Permutation2 {
	//������������λ��
	public static void swap(int i,int j,int[] nums){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	//�ж��Ƿ�ǰλ�õ���ֵ�Ƿ���ǰ����ظ�
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
