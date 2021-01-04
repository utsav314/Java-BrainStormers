
import java.util.HashMap;
import java.util.Map;


// This set of code contains Fibonacci number solving problem using hashmap and reduced time comaplexity 
// This code contains a recursive call which calculate and stores the data for the further calls . 

public class FibonacciSeries
{
  
	static int calculateFibo(int n,Map<Integer,Integer> obj) 
    {       
         for(Map.Entry<Integer,Integer> x: obj.entrySet())
         {
          if(x.getKey() == n) return x.getValue();   
         }        
     if(n<=2)
     return 1;
     else
     {
     obj.put(n, calculateFibo(n-1, obj)+ calculateFibo(n-2, obj));
     return obj.get(n);  
     }
 }

    public static void main(String args[])
    {
        Map arr=new HashMap<Integer,Integer>();
        System.out.println(FibonacciSeries.calculateFibo(40,arr));
     }

}
