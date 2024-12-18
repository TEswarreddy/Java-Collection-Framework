
import java.util.*;
class Main 
{
    static int calculations(int res,int num,String operat)
    {
        switch(operat)
        {
            
        case "+":
            res = res + num;
            return res;
        case "-":
            res = res - num;
            return res;
        case "*":
            res = res * num;
            return res;
        case "/":
            res = res / num;
            return res;
        case "%":
            res = res % num;
            return res;
            
        default:
            System.out.println("This operator is not performed in this");
            return res;
            }
    }
    public static void main(String args[])
    {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("zero", 0);
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        map1.put("four", 4);
        map1.put("five", 5);
        map1.put("six", 6);
        map1.put("seven", 7);
        map1.put("eight", 8);
        map1.put("nine", 9);
        map1.put("ten", 10);
        
        HashMap<String,String> map3 = new HashMap<>();
        map3.put("plus","+");
        map3.put("minus","-");
        map3.put("multiply","*");
        map3.put("division","/");
        map3.put("modulo","%");

        
        //Scanner sc=new Scanner(System.in);
        //String sen=sc.nextLine();

        
        String sen="SixplusnineminusThree";
        sen = sen.toLowerCase();
        //System.out.println(sen);
        int size=sen.length();
        int operands[]=new int[50];
        int n=0;
        String operator[] =new String[50];
        int m=0;
        for(int i =0;i<size;i++)
        {
            for(int j=i+1;j<=size;j++)
            {
                String word=sen.substring(i,j);
                //System.out.println(word);
                if(map1.containsKey(word))
                {
                    //System.out.println("From map1");
                    operands[n]=map1.get(word);
                    n++;
                    i=j;
                    
                }
                else if(map3.containsKey(word))
                {
                    //System.out.println("From map3");
                    operator[m]=map3.get(word);
                    m++;
                    i=j;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(operands[i]);
        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            System.out.print(operator[i]);
        }
        
        System.out.println();
        int i=0;
        int j=0;
        int result=operands[0];
        while(i<n-1)
        {
            result =calculations(result,operands[i+1],operator[j]);
            //System.out.println(result);
            j++;
            i++;
        }
        System.out.println(result);
    }
}

/*
Output:
  693
  +-
  12
*/








