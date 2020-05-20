class StockSpanner 
{
    Stack<Integer> stack1 =new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public StockSpanner() 
    {
        
    }
    
    public int next(int price) 
    {
        
        int sum=1;
        if(stack1.empty()&&stack2.empty())
        {
            stack1.push(price); 
            stack2.push(1);
            sum=1;
            System.out.println("hey");
        }
        else
        {
            int j=stack1.peek();
            
            if(price>=j)
            {
                while(!stack1.empty()&&stack1.peek()<=price)
                {
                    stack1.pop();
                    sum=sum+stack2.pop();                
                }
                stack1.push(price);
                stack2.push(sum);
            }
            else
            {
                stack1.push(price);
                stack2.push(1);
            }
           
        }
         return sum;
        
    }
}

