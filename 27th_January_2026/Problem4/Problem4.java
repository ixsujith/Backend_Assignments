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

        String n = sc.nextLine();
        // sc.nextLine();

        int num1;
        try
        {
            num1 = Integer.parseInt(String.valueOf(n));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input: " + e.getMessage());
            sc.close();
            return;
        }

        if(num1 <= 0)
        {
            System.out.println("Enter number greater than 0");
            sc.close();
            return;
        }

        
        for(int i = 0; i < num1; i++)
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
        int intSum = 0, floatCount = 0;
        double floatSum = 0.0;
        
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

        // Using Iterator
        Iterator<Number> it = list.iterator();
        System.out.println("Using Iterator:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println();
        
        // For-Each loop
        System.out.println("Using For-Each loop:");
        for(Number num : list)
        {
            System.out.println(num);
        }
    }
}