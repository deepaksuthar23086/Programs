import java.util.Scanner;
class Table{
    public static void main(String [] args){
        int table;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Table Number:");
        table = scanner.nextInt();
         for(int i = 0; i <=10; i++){
             int manltiplication = table * i;
             System.out.println(table + " * " + i + " = " + manltiplication);
         }
    }
}