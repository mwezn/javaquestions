import java.io.*;
import java.util.*;

public class Palandrome {
    
    public static void reverse(String myStr){
        String[] arr=myStr.split("");
        String[] newArr= new String[arr.length];
        String s=Arrays.toString(arr);
        String s1=Arrays.toString(newArr);
        //System.out.println(s);
        //System.out.println(s1);
        for(int i=arr.length-1;i>=0;i--){
            //System.out.println(arr[i]+" "+i);
            newArr[arr.length-i-1]=arr[i];
            
        }
        //String result=Arrays.toString(newArr);
        String reverse=String.join("",newArr);
        //System.out.println(reverse +myStr);
        //System.out.println(reverse.equals(myStr));
        if(reverse.equals(myStr)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
       
       
    }

    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        reverse(A);
        
        
    }
}
