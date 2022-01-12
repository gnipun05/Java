package FileHandling;

import java.io.File;
import java.io.IOException;

public class _1_CreateFile {
    public static void main (String args[]){
        try{
            File obj = new File("D:\\Programming Files\\Java Files\\FileHandling\\File1.txt");
            if(obj.createNewFile()){  // this checks if new file has been created using the obj object
                System.out.println("File Created: "+obj.getName());
            }
            else{
                System.out.println("File already Exists");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}