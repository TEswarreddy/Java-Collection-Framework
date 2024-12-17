
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        //System.out.println(n);
        int target = 12;
        HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if((i==k && k==j)||j==k || i==j || k==i)
                    {
                        continue;
                    }
                    int x=target-a[i]-a[j]-a[k];
                    if(h.containsKey(x) && i!=h.get(x) && j!=h.get(x) && k!=h.get(x) )
                    {
                        System.out.printf(" indexes %d %d %d %d \n",i,j,k,h.get(x));
                    }
                }
            }
            h.put(a[i],i);
        }
    }
}

/* 
Output:
 indexes 1 2 5 0 
 indexes 1 3 4 0 
 indexes 1 4 3 0 
 indexes 1 5 2 0 
 indexes 2 0 5 1 
 indexes 2 1 5 0 
 indexes 2 5 0 1 
 indexes 2 5 1 0 
 indexes 3 0 4 1 
 indexes 3 1 4 0 
 indexes 3 4 0 1 
 indexes 3 4 1 0 
 indexes 4 0 1 3 
 indexes 4 0 3 1 
 indexes 4 1 0 3 
 indexes 4 1 3 0 
 indexes 4 3 0 1 
 indexes 4 3 1 0 
 indexes 5 0 1 2 
 indexes 5 0 2 1 
 indexes 5 1 0 2 
 indexes 5 1 2 0 
 indexes 5 2 0 1 
 indexes 5 2 1 0 
*/
