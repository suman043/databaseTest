public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Numbers before Swapping");
        System.out.println(a+" "+b);
        System.out.println("Numbers after Swapping");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}