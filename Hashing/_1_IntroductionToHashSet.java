package Hashing;
import java.util.*;

public class _1_IntroductionToHashSet {
    public static void main (String args[])
    {
        HashSet<String> h = new HashSet<String>();
        // HashSet<String> h = new HashSet<String>(Capacity); // if the capacity of required hashset is already known, we can also use this kind of initialization
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h); // prints output in unordered fasshion in one single line

        Iterator <String> i= h.iterator(); // declaraion of an Iterator
        while(i.hasNext()) // this loop prints all elements in unordered but seperate lines
            System.out.println(i.next()+" ");

        System.out.println(h.contains("ide")); // checks if passed argument is contained in h or not
        
        System.out.println(h.size()); // prints present size of hashset
        h.remove("ide"); // removes the passed argument from the hashset
        System.out.println(h.size());

        for(String s:h) // {Incase of int, we will write Integer} // prints output in unordered fasshion in one single line
            System.out.println(s+" ");

        h.clear(); // this function clears the whole hashset
        System.out.println(h.isEmpty()); //checks if hashset is empty
    }
}
