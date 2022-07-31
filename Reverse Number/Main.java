import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        int reverse;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        while (number > 0) {
            reverse = number % 10;
            System.out.print(reverse);
            number = number / 10;
        }
    }
}