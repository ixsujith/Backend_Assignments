/*
Problem-4
    Create a program that:
        Accepts numeric input as strings.
        Converts them into appropriate wrapper objects.
        Stores them in a List<Number>.
        Calculates:
            Sum of all integers
            Average of floating-point numbers
        Logs invalid inputs.
Must Use
✔ Wrapper classes (Integer, Double, etc.)
✔ Autoboxing / Unboxing
✔ ArrayList
✔ NumberFormatException
✔ Iteration techniques (for-each / iterator)
*/

import java.util.*;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            try
            {
                String s = sc.nextLine();
                if(s.contains("."))
                {
                    Double floatNum = Double.parseDouble(s);
                    list.add(floatNum);
                }
                else
                {
                    Integer intNum = Integer.parseInt(s);
                    list.add(intNum);
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
        sc.close();
        int intSum = 0, floatSum = 0, floatCount = 0;
        
        for(Number nums : list)
        {
            if(nums instanceof Integer)
            {
                intSum += nums.intValue();
            }
            else if(nums instanceof Double)
            {
                floatSum += nums.floatValue();
                floatCount++;
            }
        }

        System.out.println("Sum of all integers: " + (intSum + floatSum));
        System.out.println("Average of all floating-point number: " + (floatSum/floatCount));
    }
}