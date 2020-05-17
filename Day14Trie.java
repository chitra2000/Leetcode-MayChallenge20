
class Trie
{

    /** Initialize your data structure here. */
    class Node
    {
      String a;
      Node next,right;
      public Node(String item)
      {
        a=item;
        next=null;
      }
    }
    Node root;
    public Trie() 
    {
        root=null;       
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) 
    {
       root=insertNode(root,word);   
    }
    public Node insertNode(Node root,String word)
    {
        if(root==null)
        {
            root=new Node(word);
            return root;
        }
        else
        {
            root.next=insertNode(root.next,word);
        } 
        return root;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word)
    {
        if(root==null)
            return false;
        System.out.println("inroot="+root.a);
        Node temp=root;
        while(temp!=null)
        {
            String s=temp.a;
            if(s.equals(word))
            {
             System.out.print("Yayy");
             return true;
            }
            temp=temp.next;
        }
       return false;
        
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) 
    {
        if(root==null)
            return false;
        Node temp=root;
        while(temp!=null)
        {
            String s=temp.a;
            if(s.startsWith(prefix))
             return true;
            temp=temp.next;
        }
       return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
