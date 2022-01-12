package Hashing;
import java.util.*;

public class _5_CountDistinctElements {
    public int Distinct(Integer arr[])
    {
        Set<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
    }
    public static void main (String args[])
    {
        _5_CountDistinctElements ob = new _5_CountDistinctElements();
        Scanner sc = new Scanner(System.in);
        
        int n=5;
        Integer arr[] =new Integer[n];
        for (int i=0; i<n; i++)
            arr[i]=Integer.valueOf(sc.nextInt());
            
            System.out.println(ob.Distinct(arr));
        sc.close();
    }
}