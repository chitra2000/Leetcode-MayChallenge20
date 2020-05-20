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
    
    
    public int kthSmallest(TreeNode root, int k)
    {
        
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty())
        {
            TreeNode temp=q1.poll();
            System.out.print(temp.val+" ");
            arr.add(temp.val);
            if(temp.left!=null)
            {
                
                q1.add(temp.left);
            }
            if(temp.right!=null)
            {
                
                q1.add(temp.right);
            }
        }
        System.out.println();
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        
        int val=arr.get(k-1);       
        return val;
    }
}
