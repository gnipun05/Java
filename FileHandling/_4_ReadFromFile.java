package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _4_ReadFromFile {
    public static void main (String args[]){
        try{
            File ob = new File ("D:\\Programming Files\\Java Files\\FileHandling\\File2.txt");
            Scanner sc = new Scanner(ob);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error has Occured");
            e.printStackTrace();
        }
    }
}