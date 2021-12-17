import java.util.Scanner;
public class examplestructures {
    public static void main(String args[]){
       int r, s=0,temp;
       int x;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number to check: ");
           x = sc.nextInt();
    }
       temp =x;
       while(x>0){
           r = x%10;
           s = (s*10)+r;
           x = x/10;
       }
       if (temp == s)
       System.out.println("The given number is palindrome:");
       else
       System.out.println("The given number is not palindrome:");
    }
}
