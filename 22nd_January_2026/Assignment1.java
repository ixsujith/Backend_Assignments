/* 
Create a Java program that:
    Accepts a number from the user
    Checks whether the number is:
        Positive, Negative, or Zero
        Even or Odd
        Prints the result
*/

import java.util.*;

public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0) System.out.print("The input number is 0");
        else if(a > 0 && a % 2 == 0) System.out.print("The input number is positive even number");
        else if(a > 0 && a % 2 != 0) System.out.print("The input number is positive odd number");
        else if(a < 0 && a % 2 == 0) System.out.print("The input number is negative even number");
        else System.out.print("The input number is negative odd number");
        sc.close();
    }
}