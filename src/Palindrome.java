        // TODO: Read the string
        // TODO: Convert to lower case (to handle 'Malayalam' correctly)
        // TODO: Check if the string is the same reversed
        // TODO: Print "1" if palindrome, "0" if not
import java.util.Scanner;
public class Palindrome {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                s = s.toLowerCase();
                int l = 0;
                int r = s.length()-1;
                while(l<r){
                        if(s.charAt(l) != s.charAt(r)){
                                System.out.println("0");
                                return;
                        }
                        
                        r--;
                        l++;
                }
                System.out.println("1");
        }
}