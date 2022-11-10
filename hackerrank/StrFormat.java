import java.util.Scanner;
public class StrFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if(x<100 && x>0){
                  System.out.printf ("%-14s 0%d \n", s1,x);
                }
                else if(x>=100){
                    System.out.printf ("%-14s %d \n", s1,x);
                }
                else {
                    System.out.printf ("%-14s 00%d \n", s1,x);
                }
                
                
            }
            sc.close();
            System.out.println("================================");

    }

    
}

