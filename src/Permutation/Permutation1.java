package Permutation;

/**
 * ��ӡû���ظ����ֵ�ȫ����
 * ����˵��123����ô��ӡ��
 * 123 132 213 231 312 321
 * @author YangXian
 *
 */

public class Permutation1 {
	//���õݹ�
	public static void pailie(int n, int[] nums){
		if(n == nums.length-1){//�ݹ����
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
	//������������λ��
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
