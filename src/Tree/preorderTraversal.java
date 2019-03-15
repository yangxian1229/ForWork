package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
	public static List<Integer> preporderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.empty()){
			TreeNode node = stack.pop();
			if(node !=  null){
				list.add(node.val);//访问根节点
				stack.push(node.right);//入栈右孩子
				stack.push(node.left);//入栈左孩子
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
		
		List<Integer> list = preporderTraversal(root);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(i);
		}

	}

}
