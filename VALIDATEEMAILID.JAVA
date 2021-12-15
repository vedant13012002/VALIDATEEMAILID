
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class VALIDATEEMAILID {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String z = s.next();
        
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        
        Pattern P = Pattern.compile(regex);
        Matcher M = P.matcher(z);
        if(M.matches()){
            System.out.println("Given email id is valid");
        } else {
            System.out.println("Given email id is not valid");
        }
    }
}

