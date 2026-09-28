import java.util.Scanner;

public class IT24103786Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value c: ");
        double c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println();

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same :");
            System.out.printf("Root: %.2f%n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex :");
            System.out.printf("Root 1: %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi%n", realPart, imaginaryPart);
        }

        sc.close();
    }
}