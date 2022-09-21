import java.util.Scanner;
class binarySearch {
    public static void main(String [] arg){

        int arr[] = {11,22,33,44,55,66,77,88,99};
        int interNumber, high =arr.length, low =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Search aliment of array: ");
        interNumber = scanner.nextInt();
        searchnumber(arr, interNumber, high,low);

    }
    private static void searchnumber(int[] arr, int interNumber, int high, int low) {
            int mid = (low + high) / 2;

            if (interNumber == arr[mid]) {
                System.out.println(interNumber + " This element Index Number: " + mid);
            } else if (interNumber > arr[mid]) {
                low = mid + 1;
                searchnumber(arr, interNumber, high, low);
            } else if (interNumber < arr[mid]) {
                high = mid - 1;
                searchnumber(arr, interNumber, high, low);
            }

        }
    
}
