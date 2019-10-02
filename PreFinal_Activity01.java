import java.util.*;
import java.util.Scanner;

public class PreFinal_Activity01 {

    public static void main (String[]args)
    	{
    		Scanner numScanner = new Scanner(System.in);
    		System.out.println("Input a number:");
    		int inputNum = numScanner.nextInt();
    		
    		//for ones only
    		String []ones = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
    		"Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    		//for tens only
    		String []tens = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    		
    		//the digits position only for ones number
    		if (inputNum <=19)
    			{
    				//I created the first number to determine to first value
    				int firstNum = Integer.parseInt(Integer.toString(inputNum).substring(0,1));
    				System.out.println( ones[inputNum]);
    		}
    		
    		//the digits position only for tens number
    		else if(inputNum <=99)
    			{
    				//now since there are able to read the number between 0-99 I created second number to read the tens value
    				int firstNum = Integer.parseInt(Integer.toString(inputNum).substring(0,1));
    				int secondNum = Integer.parseInt(Integer.toString(inputNum).substring(1,2));
    				
    				System.out.println(tens[firstNum-1] + " " + ones[secondNum]);
    		}
    		
    		
    		//the digits position only for hundreds or 3 digits number
    		else if(inputNum <= 999)
    			{
    				//by adding the 3 integers there are able to read the value and I added the hundred term
    				int firstNum = Integer.parseInt(Integer.toString(inputNum).substring(0,1));
    				int secondNum = Integer.parseInt(Integer.toString(inputNum).substring(1,2));
    				int thirdNum = Integer.parseInt(Integer.toString(inputNum).substring(2,3));
    				
    				System.out.println(ones[firstNum] + " Hundred " + tens[secondNum-1] + " " + ones[thirdNum]);
    		}
    		
    		//the digits position for thousand or 4 digits number
    		else if (inputNum <=1000)
    			{
    				//this time I only add the ones string because the number is only for 1000 and I added the thousand term
    				int firstNum = Integer.parseInt(Integer.toString(inputNum).substring(0,1));
    				int secondNum = Integer.parseInt(Integer.toString(inputNum).substring(1,2));
    				int thirdNum = Integer.parseInt(Integer.toString(inputNum).substring(2,3));
    				
    				System.out.println(ones[firstNum] + " Thousand ");
    		}
    		//since our professor said that number is only 0-1000 the next digits is now block or invalid
    		//number that greather than 1000 is now invalid.
    		 if (inputNum > 1000)
    			{
    				System.out.print("Invalid Number");
    		}
    }
    
    
}