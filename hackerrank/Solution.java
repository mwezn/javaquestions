import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int totalLength=A.length()+B.length();
        System.out.println(totalLength);
        char a=A.charAt(0);
        char b=B.charAt(0);
        int ascii1 =(int) a;
        int ascii2 =(int) b;
        String result=ascii1>ascii2?"Yes":"No";
        System.out.println(result);
        String cap1=A.substring(0,1).toUpperCase()+A.substring(1);
        String cap2=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(cap1 +" "+ cap2);
        
    }
}
