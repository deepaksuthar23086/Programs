import java.util.Scanner;
class Fibonacci{
    public static void main(String [] args){
        int temp, range;
        int number1 = 0;
        int number2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Range of Fabonacci Number :");
        range = scanner.nextInt();

        for(int i=1; i<=range; i++){
            System.out.println(i + ". " + number1);
            temp = number1 + number2;
            number1 = number2;
            number2 = temp;
        }
    }
}