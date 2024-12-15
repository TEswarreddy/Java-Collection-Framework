import java.util.*;
class StringToNumberAndCalculations{
    static void calculator(int operand1,int operand2,String operator)
    {
        int result=0;
        switch(operator)
        {
            
            case "+":
                result = operand1+operand2;
                System.out.println(result);
                break;
            case "-":
                result = operand1-operand2;
                System.out.println(result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case "/":
                result = operand1 / operand2;
                System.out.println(result);
                break;
            case "%":
                result = operand1 % operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid");
        }
    }
    public static void main(String args[])
    {
        Map<String, Integer> map1 = new HashMap<>();
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
        map1.put("eleven", 11);
        map1.put("twelve", 12);
        map1.put("thirteen", 13);
        map1.put("fourteen", 14);
        map1.put("fifteen", 15);
        map1.put("sixteen", 16);
        map1.put("seventeen", 17);
        map1.put("eighteen", 18);
        map1.put("nineteen", 19);
        map1.put("twenty", 20);
        map1.put("thirty", 30);
        map1.put("forty", 40);
        map1.put("fifty", 50);
        map1.put("sixty", 60);
        map1.put("seventy", 70);
        map1.put("eighty", 80);
        map1.put("ninety", 90);

        
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("hundred", 100);
        map2.put("thousand", 1000);
        map2.put("lakh", 100000);
        
        HashMap<String,String> map3 = new HashMap<>();
        map3.put("plus","+");
        map3.put("minus","-");
        map3.put("multiply","*");
        map3.put("division","/");
        map3.put("modulo","%");
        
        Scanner sc=new Scanner(System.in);
        String number_in_string=sc.nextLine();
        
        String[] words=number_in_string.toLowerCase().split("\\s+");
        
        int operand1=0;
        int temp1=0;
        int operand2=0;
	    int temp2=0;
	    
	    String operator=" ";
	    int i;
        for(i=0;i<words.length;i++)
        {
            if(map1.containsKey(words[i]))
            {
                temp1 +=map1.get(words[i]);
                //System.out.println(temp1);
            }
            else if(map2.containsKey(words[i]))
            {
                temp1 *=map2.get(words[i]);
                //System.out.println(temp1);
                if(map2.get(words[i])>=1000)
                {
                    operand1 +=temp1;
                    temp1=0;
                    //System.out.println(operand1);
                }
            }
            else if(map3.containsKey(words[i])) 
	        {
		        operator = map3.get(words[i]);
		       
		        break;
	        }
        }
    operand1 +=temp1;
    System.out.println(operand1);
        
    if(i!=(words.length-1))
    {
    	for(int j=i+1;j<words.length;j++)
        {
            if(map1.containsKey(words[j]))
            {
                temp2 +=map1.get(words[j]);
               // System.out.println(temp2);
            }
            else if(map2.containsKey(words[j]))
            {
                temp2 *=map2.get(words[j]);
                //System.out.println(temp2);
                if(map2.get(words[j]) >=1000)
                {
                    operand2 +=temp2;
                    temp2=0;
                    //System.out.println(operand2);
                }
            }
	   
        }
        operand2 +=temp2;
	    System.out.println(operand2);
	    System.out.println(operator);
	    calculator(operand1,operand2,operator);
    }
	
	
}
}

/*
input:
      two hundred ninety nine plus two
Output:
      299
      2
      +
      301

*/
