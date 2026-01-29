/*
Write a Java program that reads student details from a text file, processes the data, and writes the results to another file.
 
Each line in the input file contains:
id,name,age
 
The program should:
    Read the file line by line
    Clean and format the data
    Ignore duplicate student entries
    Handle invalid data without stopping the program
    Store and display processed data
    Write valid and invalid records to separate files
    Log important steps during execution
 
Expected Behavior:
    Extra spaces in names should be removed
    Student age must be 18 or above
    Invalid records should be skipped and recorded
    Duplicate students should be removed
    Final valid students should be printed and saved
    Use proper data types while reading numeric values
    Compare objects correctly when removing duplicates
    Ensure the program continues even if one record is invalid
    Use efficient string manipulation for formatting
    Do not use System.out.println for regular messages
 
Must Use
✔ String and common string methods
✔ StringBuilder
✔ Wrapper classes
✔ Autoboxing / Unboxing
✔ Arrays (for input parsing)
✔ Collections framework
✔ List, Set, Map
✔ ArrayList, HashSet, HashMap
✔ Iteration techniques (for-each / iterator)
✔ Proper object comparison
✔ Exception handling using try-catch-finally
✔ throw and throws
✔ At least one custom exception
✔ File input/output
✔ Reading and writing files
✔ Logging (no System.out.println)
 
 
Input Example (students.txt)
1, Ram ,22
2, Ravi,17
3, Raju ,22
x, John,25
 
Output Files
valid.txt → valid student records
invalid.txt → invalid or failed records
*/

import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class IncompleteDataException extends Exception
{
    public IncompleteDataException(String message)
    {
        super(message);
    }
}

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

class duplicateRemoval
{
    int id;
    String name;
    int age;

    public duplicateRemoval(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
}

public class Problem5
{
    private static final Logger logger = Logger.getLogger(Problem5.class.getName());

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = null;
        BufferedWriter valid = null;
        BufferedWriter invalid = null;

        Set<duplicateRemoval> studentSet = new HashSet<>();

        try
        {
            br = new BufferedReader(new FileReader("input.txt"));
            valid = new BufferedWriter(new FileWriter("valid.txt"));
            invalid = new BufferedWriter(new FileWriter("invalid.txt"));

            String line;

            while((line = br.readLine()) != null)
            {
                try
                {
                String[] data = line.split(",");

                if(data.length < 3)
                {
                    throw new IncompleteDataException("Fill in the details completely: " + line);
                }

                Integer id = Integer.parseInt(data[0].trim());
                String name = data[1].trim().replaceAll("\\s+", " ");
                Integer age = Integer.parseInt(data[2].trim());

                if(age < 18)
                {
                    throw new InvalidAgeException("Age should be >= 18: " + line);
                }

                duplicateRemoval student = new duplicateRemoval(id, name, age);

                if (studentSet.contains(student))
                {
                    invalid.write(line + "\n");
                    continue;
                }
                else
                {
                    studentSet.add(student);
                    valid.write(student.toString() + "\n");
                }

                // StringBuilder sb = new StringBuilder();
                // sb.append(id + ", ");
                // sb.append(name + ", ");
                // sb.append(age);

                // valid.write(sb.toString() + "\n");
                }
                catch (IncompleteDataException e)
                {
                    invalid.write(line + "\n");
                }
                catch (InvalidAgeException e)
                {
                    invalid.write(line + "\n");
                }
                catch (NumberFormatException e)
                {
                    invalid.write(line + "\n");
                }
            }
        }
        catch (IOException e)
        {
            throw e;
        }
        finally
        {
            if(br != null)
            {
                br.close();
            }
            if(valid != null)
            {
                valid.close();
            }
            if(invalid != null)
            {
                invalid.close();
            }
        }
    }
}