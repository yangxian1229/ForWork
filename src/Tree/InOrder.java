package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 树的中序遍历非递归
 * @author YangXian
 *
 */

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
		left = null;
		right = null;
	}
	TreeNode(int val,TreeNode left,TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class InOrder {
	public static List<Integer> inOrder(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!= null || !stack.empty()){
			while(root != null){
				stack.push(root);
				root = root.left;
			}
			TreeNode node = stack.pop();
			list.add(node.val);
			root = node.right;
		}
		return list;
	}
	

	public static void main(String[] args) {
		TreeNode val_2 = new TreeNode(2);
		TreeNode val_4 = new TreeNode(4);
		TreeNode val_3 = new TreeNode(3,val_2,val_4);
		TreeNode val_6 = new TreeNode(6);
		TreeNode root = new TreeNode(5,val_3,val_6);
		
		List<Integer> list = inOrder(root);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(i);
		}

	}

}
