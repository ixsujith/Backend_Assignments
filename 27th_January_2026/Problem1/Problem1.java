/*
    Create a program that:
        Reads a paragraph from a file.
        Performs the following:
            Count total words, sentences, and characters (excluding spaces).
            Find the top 5 most frequent words (case-insensitive).
            Replace multiple spaces with a single space.
            Reverse each sentence without changing word order.
        Compare strings using both == and equals() and print results with explanation.
Must Use
✔ String class
✔ StringBuilder
✔ Common String methods (split, toLowerCase, trim, replace)
✔ equals() vs ==
✔ File reading
✔ Exception handling (try-catch)
*/

import java.io.*;
import java.util.*;
public class Problem1
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            StringBuilder text = new StringBuilder(); // Used to store entire paragraph (further used for duplicate space removal)
            
            // Counting number of lines, words, and characters in the file
            int lineCount = 0, wordCount = 0, characterCount = 0;
            List<String> words = new ArrayList<>();
            while((line = br.readLine()) != null)
            {
                text.append(line).append("\n"); // Storing the entire para for duplicate space removal

                lineCount++;
                String[] inLine = line.split("\\s+");
                wordCount += inLine.length;
                characterCount += line.length();
                for(String a : inLine) {
                    if(!a.isEmpty()) words.add(a);
                }
            }
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + characterCount);

            System.out.println();

            // Top 5 most frequent words
            Map<String, Integer> map = new HashMap<>();
            for(String word : words)
            {
                word = word.toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words are: ");
            for(int i = 0; i < Math.min(5, list.size()); i++) // Math.min handles IndexOutOfBounds edge case
            {
                System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
            }
            
            System.out.println();

            // Cleaning duplicate spaces and writing to a new file
            FileWriter fw = new FileWriter("sample_noDuplicateSpaces.txt");
            String sentence = text.toString().replaceAll("\\s+", " ");
            fw.write(sentence);
            fw.close();

            System.out.println();

            // Reversing each sentence without changing word order
            String[] sentences = text.toString().split("(?<=[.!?])\\s*");
            System.out.println("Reverse operation: ");
            for(String s : sentences)
            {
                String[] stringWords = s.split(" ");
                StringBuilder rev = new StringBuilder();
                for(int i = stringWords.length - 1; i >= 0; i--)
                {
                    rev.append(stringWords[i]);
                    rev.append(" ");
                }
                System.out.println(rev.toString());
            }

            System.out.println();

            // Comparing strings using == and equals()
            String S1 = "JavaProgramming";
            String S2 = "JavaProgramming";
            String S3 = new String("JavaProgramming");
            System.out.println("Comparing S1 and S2 using == operator: " + (S1 == S2));
            System.out.println("Comparing S1 and S3 using == operator: " + (S1 == S3));
            System.out.println("Comparing S1 and S2 using equals() method: " + S1.equals(S2));
            System.out.println("Comparing S1 and S3 using equals() method: " + S1.equals(S3));

            System.out.println("Explaination:");
            System.out.println("The == is an opeartor the compares the memory location, whereas equals() is a method that compares the content-values.")
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}