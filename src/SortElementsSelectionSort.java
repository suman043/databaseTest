import java.util.Arrays;

public class SortElementsSelectionSort {
    public static void main(String args[]){
        int a[] = {2,5,1,0,7,3,11,4};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
    }
}