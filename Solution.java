class CharArray {
    public static void main(String args[]){
        String a="Hello";
        for(char c : a.toCharArray()){  //instead of c, any character array can be used to store the individual characters of String a
            System.out.println(c+" ");
        }
    }
}