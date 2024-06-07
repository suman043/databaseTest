public class ReverseNumber {
    public static void main(String[] args) {
        int a = 2318562;
        int temp = a;
        int rem, sum = 0;
        String remString = "";
        while(temp != 0){
            rem = temp % 10;
            remString = remString + rem;
            sum = (sum*10) + rem;
            temp = temp / 10;
        }
        System.out.println("Original Number : "+a);
        a = sum;
        System.out.println("Reversed Number : "+a);
        System.out.println("Reversed Number : "+remString);
    }
}