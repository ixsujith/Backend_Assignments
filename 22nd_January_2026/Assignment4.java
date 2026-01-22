/*
Create a class Student with:
    Private fields:
        id
        name
        marks
    Constructor to initialize values
    Getters and setters
    Method:
        isPassed() → returns true if marks ≥ 40
Create objects of Student and display result.
*/

class Student
{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return marks;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public boolean isPassed()
    {
        if(this.marks >= 40) return true;
        else return false;
    }

    public void getDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + isPassed());
    }
}
public class Assignment4
{
    public static void main(String[] args)
    {
        Student S1 = new Student(1, "user_1", 70);
        Student S2 = new Student(2, "user_2", 80);
        Student S3 = new Student(3, "user_3", 39);

        System.out.println("S1");
        S1.getDetails();
        System.out.println("S2");
        S2.getDetails();
        System.out.println("S3");
        S3.getDetails();

        System.out.println();
        System.out.println("Updated data: ");
        System.out.println();

        S1.setMarks(94);
        S2.setMarks(92);
        S3.setMarks(84);

        System.out.println("S1");
        S1.getDetails();
        System.out.println("S2");
        S2.getDetails();
        System.out.println("S3");
        S3.getDetails();
    }
}