package Strings;

// Naive Method, as it takes theta(n) Auxilary space and time complexity
// public class _3_PalindromeString {
//     public static void main(String args[]){
//         String str = "ABCCBA";
//         StringBuffer str2 = new StringBuffer(str); // this stringbuffer is made to reverse the given string
//         str2.reverse();
//         System.out.println(str.equals(str2.toString()));
//     }
// }


// Efficient Solution, BigOh(n) time complexity and Bigoh(1) Auxilary Space
public class _3_PalindromeString {
    public static void main(String args[]){
        String str = "ABCCBA";
        boolean flag=true;
        for(int i=0; i<str.length()/2; i++)
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=false;
                break;
            }
        System.out.println(flag);
    }
}