import java.io.*;
import java.util.*;

public class StaticInit {
    
    static  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter breadth:");
        int B=sc.nextInt();
        System.out.println("Enter height:");
        int H= sc.nextInt();
        if (H>0 && B>0){
            System.out.printf ("The area is: %d \n",H*B);
        }
        else {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StaticInit S= new StaticInit();
        
    }
}
