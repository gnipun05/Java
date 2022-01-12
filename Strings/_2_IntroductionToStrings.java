package Strings;

public class _2_IntroductionToStrings {
    public static void main (String args[]){
        String str = "geeks";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.length());
        System.out.println(str.substring(1,3));

        String str2="geeks"; // when String storing same word is created like this, then both str and str2 are refering to same memory location
        if(str==str2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        String str3 = new String("geeks"); // when a String is declared using "new"  keyword, a new memory is allocated for it. Therefore str!=str3
        if(str==str3)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(str.equals(str3)); // true

        String str4="geeksforgeeks";
        System.out.println(str4.contains(str)); // true

        String str5 = "test";
        System.out.println(str.compareTo(str5)); //Lexicographical Comparison // answer equivalent to str-str5

        System.out.println(str4.indexOf("geeks"));
        System.out.println(str4.indexOf("geeks",1)); // now, the function will start searching from index 1

        String str6 = "forgeeks";
        System.out.println(str.concat(str6)); // returns a new String :- geeksforgeeks
    }
}
