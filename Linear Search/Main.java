import java.util.Scanner;
class LinearSearch{
    public static void main(String [] args){
        int key;
        boolean text = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the key value :");
        key = scanner.nextInt();
        int[] array = {1, 23,4,45,24,55,32,12,13};
        int i = array.length-1;

        if(array[i]==key) {
            System.out.println(text);
            System.out.println("index number :" + i);
        }
        else {
            System.out.println("folse");
        }
    }
}