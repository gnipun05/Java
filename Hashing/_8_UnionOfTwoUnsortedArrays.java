package Hashing;
import java.util.*;

public class _8_UnionOfTwoUnsortedArrays {
    public static void Union(int a[], int b[]){
        HashSet <Integer> s = new HashSet<Integer>();
        for(int i:a)
            s.add(i);
        for(int i:b)
            s.add(i);
        System.out.println(s);
    }
    public static void main (String args[]){
        int a[]={1,2,3,4,5,6};
        int b[]={2,4,6,8,10};
        Union(a,b);
    }
}
