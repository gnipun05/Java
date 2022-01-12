package Hashing;
import java.util.*;

public class _7_IntersectionOfTwoArrays {

    public int FindIntersection(int a[],int b[]){
        int res=0;
        HashSet <Integer> h = new HashSet<>();
        for (int i:a)
            h.add(i);
        
        for(int i:b){
            if(h.contains(i)){
                res++;
                h.remove(i);            
            }
        }
        return res;
    }

    public static void main (String args[]){
        _7_IntersectionOfTwoArrays ob = new _7_IntersectionOfTwoArrays();
        int a[]={2,4,6,8,10};
        int b[]={1,2,3,4,5,6};
        System.out.println(ob.FindIntersection(a,b));
    }
}
