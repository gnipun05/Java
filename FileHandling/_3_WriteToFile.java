package FileHandling;

import java.io.IOException;
import java.io.FileWriter;

public class _3_WriteToFile {
    public static void main (String args[]){
        try{
            FileWriter ob = new FileWriter("D:\\Programming Files\\Java Files\\FileHandling\\File2.txt");
            ob.write("This line is being writen by _3_WriteToFile.java class.");
            ob.close();
            System.out.println("Successfully printed in the File");
        }
        catch (IOException e){
            System.out.println("An error has Occured");
            e.printStackTrace();
        }
    }
}