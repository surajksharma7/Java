import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
class MyException {
    public static void main(String[] args) {
        System.out.println("Enter your full name");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(" " +(s.charAt(0)));
        try{
        for(int i=0; i<s.length(); ++i){
            if(" " +(s.charAt(i)) equals (" ")) sb.append("" + (s.charAt(i+1)));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(sb);
        }
        
    }
    
}
