import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = input.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = input.nextDouble();
            sum += num;
        }
        double average = sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        input.close();
    }
}