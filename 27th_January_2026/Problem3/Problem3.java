/*
Problem-3
    Build a validation framework that:
        Validates username, age, and email
        Throws custom exceptions for invalid data
        Differentiates checked vs unchecked exceptions
        Logs validation completion
Must Use
✔ Checked exceptions
✔ Unchecked exceptions
✔ try-catch-finally
✔ throw vs throws
✔ Custom exception classes
*/

import java.util.*;

class InvalidUserNameException extends Exception
{
    InvalidUserNameException(String message)
    {
        super(message);
    }
}

class InvalidAgeException extends RuntimeException
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

class InvalidEmailException extends Exception
{
    InvalidEmailException(String message)
    {
        super(message);
    }
}

class Validator
{
    static void userNameValidate(String userName) throws InvalidUserNameException
    {
        if(userName == null || userName.length() < 2)
        {
            throw new InvalidUserNameException("Invalid Usename input");
        }
    }

    static void ageValidate(int age)
    {
        if(age < 0)
        {
            throw new InvalidAgeException("Invalid Age input");
        }
    }

    static void emailValidate(String email) throws InvalidEmailException
    {
        if(email == null || !email.contains("@"))
        {
            throw new InvalidEmailException("Invalid Email input");
        }
    }
}

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String email = sc.nextLine();

        sc.close();

        try
        {
            Validator.userNameValidate(userName);
            Validator.ageValidate(age);
            Validator.emailValidate(email);
        }
        catch (InvalidUserNameException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());;
        }
        catch (InvalidEmailException e)
        {
            System.out.println(e.getMessage());;
        }

        finally
        {
            System.out.println("The details have been validated");
        }

    }
}