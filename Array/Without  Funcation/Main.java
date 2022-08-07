class ArrayAddition {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.print("Sum of Array:- \n" + "{");
        for (int i = 0; i <= array.length-1; i++) {
            int arraysum = array[i];
            sum = sum + arraysum;
            System.out.print( arraysum + ",");
        }
        System.out.print("} = " + sum);
    }
}