package General;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EndTerm {
    public static void main(String args[]) throws Exception{
        File file = new File("C:\\Users\\gnipu\\Desktop\\Listen.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> ar = new ArrayList<String>();
        while(sc.hasNext())
            ar.add(sc.next());

        Collections.sort(ar);
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(int i=0; i<ar.size(); i++)
            if(str.equals(ar.get(i)))
                count++;

        System.out.println(count);
        ar.remove(new String("you"));
        ar.remove(10);
        System.out.println(ar);
        sc.close();
        s.close();
    }
}