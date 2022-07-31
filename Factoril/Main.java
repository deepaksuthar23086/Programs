import java.util.Scanner;
class Factoril{
    public static void main(String [] args){
        int number, multification = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factoil Number ;");
        number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            int a  = 1;
            a = a * i;
            multification = multification * a;
        }
        System.out.println(multification);
    }
}