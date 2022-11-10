import java.util.Scanner;
public class Server {
    
    public Server(int port){
        System.out.println(port);
        //int portNumber= Integer.parseInt(args[0]);
    }

    public static void main(String[] args){
        //Server test= new Server();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        String key=input.next();
        input.close();
        System.out.println("You entered integer:"+ number);
        System.out.println("You entered character:"+ key);
    }
}
