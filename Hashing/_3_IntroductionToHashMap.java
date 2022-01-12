package Hashing;
import java.util.*;

public class _3_IntroductionToHashMap {
    public static void main (String args[])
    {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        // HashMap<String> h = new HashMap<String>(Capacity); // if the capacity of required hashMap is already known, we can also use this kind of initialization
        m.put("gfg",10);
        m.put("courses",15);
        m.put("ide",20);

        System.out.println(m); // prints output in unordered fasshion in one single line

        System.out.println(m.containsKey("ide")); // checks if passed key is contained in m or not
        System.out.println(m.containsValue(15)); // checks if passed value is contained in m or not
        
        System.out.println(m.size()); // prints present size of hashMap
        System.out.println(m.remove("ide")); // removes the value and key present on the passed key argument from the hashMap and returns the value of given key i.e. 20 here
        System.out.println(m.size());

        for(Map.Entry <String,Integer> e : m.entrySet()) // prints output in unordered fasshion in one single line
            System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(m.get("gfg")); // returns 10 i.e. value strored at the passed key
        System.out.println(m.get("practice")); // returns null

        m.clear(); // this function clears the whole hashMap
        System.out.println(m.isEmpty()); //checks if hashMap is empty
    }
}
