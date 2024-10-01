import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Get the information of the employee

        System.out.println("What is your firstname?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("What is your lastname?");
        String lastName = scanner.nextLine();

        String email = firstName + "." + lastName + "@mentormakers.com";

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your employee number?");
        int employeeNumber = scanner.nextInt();

        //Print all the employee characteristics
        // as well with an additional one for email

        System.out.println(firstName + " " + lastName + " " + age + " " + employeeNumber + " " + email);




    }
}