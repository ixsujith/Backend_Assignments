/*
Create a class Employee with:
    Fields:
        id, name, monthlySalary
    Static field:
        companyName
    Constructor
    Method:
        calculateAnnualSalary()
        displayEmployeeDetails()
Create at least 2 Employee objects and print their details.
*/

public class Assignment5
{
    static class Employee
    {
        private int id;
        private String name;
        private int monthlySalary;
        private static String companyName;

        public Employee(int id, String name, int monthlySalary)
        {
            this.id = id;
            this.name = name;
            this.monthlySalary = monthlySalary;
        }
        
        public int getId()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
        public int getMonthlySalary()
        {
            return monthlySalary;
        }

        public void setId(int id)
        {
            this.id = id;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public void setMonthlySalary(int monthlySalary)
        {
            this.monthlySalary = monthlySalary;
        }

        static
        {
            companyName = "CompSci";
        }

        public int calculateAnnualSalary()
        {
            return monthlySalary * 12;
        }

        public void displayEmployeeDetails()
        {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Monthly Salary: " + monthlySalary);
            System.out.println("Annual Salary: " + calculateAnnualSalary());
        }
    }
    public static void main(String[] args)
    {
        Employee emp1 = new Employee(1, "emp_1", 40000);
        Employee emp2 = new Employee(2, "emp_2", 50000);
        Employee emp3 = new Employee(3, "emp_3", 60000);

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        emp3.displayEmployeeDetails();
        System.out.println();
    }
}