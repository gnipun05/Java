package FileHandling;

import java.io.File;
import java.io.IOException;
public class _2_FileInformation{
    public static void main (String args[])throws IOException{
        File ob = new File("D:\\Programming Files\\Java Files\\FileHandling\\File2.txt");
        if(!ob.createNewFile()){  // if(ob.exists()) is also correct
            System.out.println("File Name     "+ob.getName());
            System.out.println("Absolute Path "+ob.getAbsolutePath());
            System.out.println("Writeable     "+ob.canWrite());
            System.out.println("Readable      "+ob.canRead());
            System.out.println("Size of File in Bytes  "+ob.length());
        }
        else{
            System.out.println("File doesn't exists");
        }
    }
}