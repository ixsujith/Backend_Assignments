/*
Create a Java program that has the following methods:
    add(int a, int b) → returns sum
    isEven(int number) → returns true/false
    findFactorial(int number) → returns factorial
Call these methods from main() and print results.
*/

import java.util.*;
public class Assignment3
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public boolean isEven(int number)
    {
        if(number % 2 == 0) return true;
        else return false;
    }
    public int findFactorial(int number)
    {
        if(number < 0) return -1;
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Assignment3 obj = new Assignment3();
        int a, b, number;
        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum: " + obj.add(a, b));
        System.out.println("Enter a number:");
        number = sc.nextInt();
        System.out.println("Even: " + obj.isEven(number));
        System.out.println("Factorial: " + obj.findFactorial(number));

        sc.close();
    }
}