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
    int levelNode(TreeNode root,int key,int level)
    {
        if(root==null)
            return 0;
        if(root.val==key)
            return level;
        int result=levelNode(root.left,key,level+1);
        if(result!=0)
            return result;
        result=levelNode(root.right,key,level+1);
        return result;
    }
   
    boolean  sameParent(TreeNode root,int x,int y)
    {
        if(root==null)
            return false;
        if(root.left!=null&&root.right!=null)
        {
            if((root.left.val==x&&root.right.val==y)||(root.left.val==y&&root.right.val==x))
                return true;
        }
        boolean l=sameParent(root.left,x,y);
        if(l)
            return true;
        boolean r=sameParent(root.right,x,y);
        if(r)
            return true;
        return false;
    }
    public boolean isCousins(TreeNode root, int x, int y)
    {
        int c1=0,c2=0;  
        c1=levelNode(root,x,0);
        c2=levelNode(root,y,0);
        System.out.println(c1+" "+c2);
        if(c1==c2)
        {
            boolean b=sameParent(root,x,y);
            if(b==true)
                return false;
            else
                return true;
        }       
     return false;
    }
        
        
    
}
