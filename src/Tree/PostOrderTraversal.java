package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * ���ĺ������зǵݹ�
 * ���Ҹ�
 * @author YangXian
 *
 */

public class PostOrderTraversal {
	public static List<Integer> postOrder(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre = null;//��¼ǰһ�������ʵĽڵ�
		while(root != null || !stack.empty()){
			if(root != null){
				stack.push(root);
				root = root.left;
			}else{
				root = stack.peek();//�鿴ջ��Ԫ��
				//����������������û�з��ʹ����������ѹ��ջ��ֱ������ý������������������ж�
				if(root.right != null && pre != root.right){
					root = root.right;
					stack.push(root);
					root = root.left;//����������������
				}else{
					//���������ʹ��ˣ�����������Ϊ�գ�����Գ�ջ
					TreeNode node = stack.pop();
					list.add(node.val);
					pre = node;
					root = null;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode val_2 = new TreeNode(2);
		TreeNode val_4 = new TreeNode(4);
		TreeNode val_3 = new TreeNode(3,val_2,val_4);
		TreeNode val_6 = new TreeNode(6);
		TreeNode root = new TreeNode(5,val_3,val_6);
		
		List<Integer> list = postOrder(root);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(i);
		}

	}

}
