package Hashing;

import java.util.*;

public class _6_FrequenciesOfArrayElements {
    public void CalculateFreq(int arr[])
    {
        HashMap <Integer,Integer> m = new HashMap <>();
        for (int i : arr)
            m.put(i,m.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer>e:m.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
    public static void main (String args[])
    {
        _6_FrequenciesOfArrayElements ob = new _6_FrequenciesOfArrayElements();
        Scanner sc = new Scanner(System.in);

        int n=5;
        int arr[]=new int[n];
        for (int i=0; i<n; i++)
            arr[i]=sc.nextInt();
    
        ob.CalculateFreq(arr);
        sc.close();
    }
}
