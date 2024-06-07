import java.util.Arrays;

public class SortElementsBubbleSort {
    public static void main(String[] args) {
        int a[] = {2,5,1,0,7,3,11,4};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j =0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
    }
}
