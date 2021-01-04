
import java.util.HashMap;
import java.util.Map;


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