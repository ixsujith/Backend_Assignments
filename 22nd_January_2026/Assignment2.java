/*
Write a Java program to:
    Print numbers from 1 to N
    Print all even numbers between 1 and N
    Calculate the sum of numbers from 1 to N
*/

import java.util.*;
public class Assignment2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N <= 0)
        {
            System.out.println("Enter a positive integer greater than 0");
            sc.close();
            return;
        }
        int i = 1;
        System.out.println("Iterations from 1 to " + N + ": ");
        while(i < N+1)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("Even numbers between 1 to " + N + ": ");
        for(int j = 1; j <= N; j++)
        {
            if(j % 2 == 0)
            {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        int sum = 0;
        for(int k = 1; k <= N; k++)
        {
            sum = sum + k;
        }
        System.out.print("Sum of all the numbers from 1 to " + N + ": " + sum);
        sc.close();
    }
}