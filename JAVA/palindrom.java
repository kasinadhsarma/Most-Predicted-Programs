import java.util.*;
public class palindrom {
    public static void main(String[]args){
      String orginal,reverse = "";
      try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter a string/number to check if it is a palindrome");
          orginal = in.nextLine();
    }
      int length = orginal.length();
      for (int i = length -1; i >=0; i--)
      reverse =reverse+orginal.charAt(i);
      if(orginal.equals(reverse))
      System.out.println("Entered string/number is palindrome.");
      else
      System.out.println("Entered string/number isn't a palindrome.");
    }
}
