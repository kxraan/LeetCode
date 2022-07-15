/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root!=null){
           root = deleteAux(key, root);
			return root; 
        }else
            return null;
    }
    
    private TreeNode deleteAux(int key, TreeNode rootAux) {
		if (rootAux == null) {
			return null;
		} else {

			int comparison =(key- rootAux.val);

			if (comparison == 0) {
				if (rootAux.left == null && rootAux.right == null) {
					rootAux = null;
					return rootAux;
				} else {

					if (rootAux.left != null) {
						TreeNode leftMax = maxAux(rootAux.left);
						rootAux.val = leftMax.val;
						//rootAux.value = leftMax.getValue();
						rootAux.left = deleteAux(rootAux.val, rootAux.left);
					} else {
					TreeNode rightMin = minAux(rootAux.right);
						rootAux.val = rightMin.val;
						//rootAux.value = rightMin.getValue();
						rootAux.right = deleteAux(rootAux.val, rootAux.right);
					}
				}
			} else if (comparison < 0) {
				rootAux.left = deleteAux(key, rootAux.left);
				return rootAux;
			} else {
				rootAux.right = deleteAux(key, rootAux.right);
				return rootAux;
			}

			return rootAux;

		}

	}
    
	private TreeNode maxAux(TreeNode rootAux) {
		if (rootAux.right == null) {
			return new TreeNode(rootAux.val);
		} else {
			return maxAux(rootAux.right);
		}
	}
    
	private TreeNode minAux(TreeNode rootAux) {
		if (rootAux.left == null) {
			return new TreeNode(rootAux.val);
		} else {
			return minAux(rootAux.left);
		}
    }
	

}
