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
class Solution 
{ 
    public TreeNode insertNode(TreeNode root,int data)
    {
        if(root==null)
        {
            root=new TreeNode(data);
            return root;
        }
        if(root.val>data)
          {
            root.left=insertNode(root.left,data);
          }
       else if(root.val<data)
            {
                root.right=insertNode(root.right,data);
            }    
        return root;
    }
    public TreeNode bstFromPreorder(int[] arr)
    {
        TreeNode root=null;
        for(int i=0;i<arr.length;i++)
        {
          root=insertNode(root,arr[i]);
        }
       return root; 
    }
}
