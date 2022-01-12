package Queue;
import java.util.*;

public class _6_GenerateNumbersWithGivenDigits {  // Creating function for Given digits as 5 and 6
    public void Generate(int n){
        Queue <String> q = new ArrayDeque<>();
        q.offer("5");
        q.offer("6");
        for(int i=0; i<n; i++){
            String temp = q.poll();
            System.out.print(temp+" ");
            q.offer(temp+"5");
            q.offer(temp+"6");
        }
    }
}