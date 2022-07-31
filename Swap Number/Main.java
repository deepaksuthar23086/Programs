import java.util.Scanner;

class SwapNumber {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int first_number = scanner.nextInt();
        int second_number = scanner.nextInt();

        System.out.println("Before number: ");
        System.out.println("First number: " + first_number);
        System.out.println("Second number: " + second_number);
        swap(first_number, second_number);
        System.out.println("After number: " + first_number, + second_number);

        swap(int first_number, int second_number );
        {
            int temp;
            temp = first_number;
            first_number = second_number;
            second_number = temp;
        }
    }
}
