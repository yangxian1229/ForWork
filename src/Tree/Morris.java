package Tree;

/**
 * 空间复杂度为O（1）的树的中序遍历，时间复杂度为O（n)
 * https://blog.csdn.net/tyler_download/article/details/72599057
 * @author YangXian
 *
 */

public class Morris {
	
	
	//获取当前节点的前序节点
	private TreeNode getPredecessor(TreeNode node){
		TreeNode pre = node;
		if(node.left != null){
			pre = pre.left;
			while(pre.right != null && pre.right != node){
				pre = pre.right;
			}
		}
		return pre;
	}
	
	public void travel(TreeNode node){
		while(node != null){
			
			if(node.left == null){
				System.out.println(node.val);
				node = node.right;
			}else{
				TreeNode pre = getPredecessor(node);
				
				if(pre.right == node){
					System.out.println(node.val);
					pre.right = null;
					node = node.right;
				}else if(pre.right == null){
					pre.right = node;
					node = node.left;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1,null,null);
		TreeNode n3 = new TreeNode(3,null,null);
		TreeNode n2 = new TreeNode(2,n1,n3);
		TreeNode n5 = new TreeNode(5,null,null);
		TreeNode n4 = new TreeNode(4,n2,n5);
		TreeNode n8 = new TreeNode(8,null,null);
		TreeNode n7 = new TreeNode(7,null,n8);
		TreeNode n10 = new TreeNode(10,null,null);
		TreeNode n9 = new TreeNode(9,n7,n10);
		TreeNode n6 = new TreeNode(6,n4,n9);
		
		Morris morrise = new Morris();
		morrise.travel(n6);

	}

}
