import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayUniqueElements {
    public static void main(String[] args) {
        int a[] = {5,1,7,1,3,5,9,2,4};
        System.out.println(Arrays.toString(a));
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hashSet.add(a[i]);
        }
        System.out.println(hashSet);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            linkedHashSet.add(a[i]);
        }
        System.out.println(linkedHashSet);
        int uniqueElements[] = new int[hashSet.size()];
        System.out.println(Arrays.toString(uniqueElements));
        int counter = 0;
        for(int unique:hashSet){
            uniqueElements[counter++] = unique;
        }
        System.out.println(Arrays.toString(uniqueElements));
    }
}
