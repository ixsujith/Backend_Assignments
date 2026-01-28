/*
Problem-2
    Given an array of employee names (with duplicates):
        Convert array → ArrayList
        Remove duplicates using HashSet
        Create a HashMap<String, Integer> for frequency count
        Display data using multiple iteration techniques
Must Use
✔ Arrays
✔ ArrayList
✔ HashSet
✔ HashMap
✔ Iterators and enhanced for-loop
✔ equals() internally (HashSet behavior)
*/

import java.util.*;

public class Problem2
{
    public static void main(String[] args)
    {
        String[] empNames = {"user_1", "user_2", "user_3", "user_4", "user_5", "user_1", "user_6", "user_2", "user_7", "user_8", "user_3", "user_9", "user_1", "user_10", "user_2", "user_11", "user_12", "user_4", "user_5", "user_1", "user_6", "user_7", "user_3", "user_8", "user_9", "user_10", "user_1", "user_11", "user_12", "user_2"};


        // Array to ArrayList
        List<String> list = new ArrayList<>(Arrays.asList(empNames));
        System.out.println(list);

        System.out.println();

        // Array to HashSet
        Set<String> set = new HashSet<>(Arrays.asList(empNames));
        System.out.println(set);

        System.out.println();

        // HashMap implementation
        Map<String, Integer> map = new HashMap<>();
        for(String name : empNames)
        {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        System.out.println(map);;

        System.out.println();

        // Multiple iteration techniques
        System.out.println("Multiple Iterations Techniques:");
        // 1) For loop
        System.out.println("1) Using For Loop:");
        for(int i = 0; i < empNames.length; i++)
        {
            System.out.print(empNames[i] + " ");
        }

        System.out.println("\n");

        // 2) Enhanced for-loop (ArrayList)
        System.out.println("2) Using Enhanced For-Loop (ArrayList):");
        for(String n1 : list)
        {
            System.out.print(n1 + " ");
        }

        System.out.println("\n");

        // 3) Iterator (HashSet)
        System.out.println("3) Using Iterator (HashSet):");
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n");

        // 4) MapEntry (HashMap)
        System.out.println("Using MapEntry (HashMap):");
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}