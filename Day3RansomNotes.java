class Solution
{
    public boolean canConstruct(String r, String m) 
    {
        for(int i=0;i<r.length();i++)
        {
            char ch=r.charAt(i);
            String x=ch+"";
            if(!m.contains(x))
                return false;
            else
            {
                int k=m.indexOf(ch);
                System.out.println(k);
                m =m.substring(0,k)+m.substring(k+1);
                System.out.println(m);
            }
        }
        return true;
        
    }
}
