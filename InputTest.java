import java.util.Scanner;


public class InputTest {
    public static void main(String[] args) {
        //Este é meu segundo programa em java


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello " + name);
                scanner.nextLine(); // Limpa o buffer do scanner após ler a linha anterior


 System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        System.out.println("Your favorite color is " + color + ".");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old.");

 System.out.println("Enter your temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Your temperature is " + temperature + " degrees.");

System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student: " + isStudent);     

if (isStudent) {
    System.out.println("You are a student.");
} else {
    System.out.println("You are NOT a student.");
}
       

         scanner.close();
    }
}