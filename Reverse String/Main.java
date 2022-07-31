class ReverseCharacter{
    public static void main(String [] args){
        String name = "Deepak";
        String reverse = "";
        char array[] = name.toCharArray();

        for(int i = 5; i>=args.length; i--){
            char ch;
            ch = array[i];
            reverse = reverse + ch;
        }
        System.out.print(reverse);
    }

}