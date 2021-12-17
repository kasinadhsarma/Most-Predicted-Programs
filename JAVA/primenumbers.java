import java.util.Scanner;
public class primenumbers {
    public static void main(String[]args){
       try (Scanner S = new Scanner(System.in)) {
        System.out.println("Enter a number:");
           int n = S.nextInt();
           if (isPrime(n)){
               System.out.println(n+"is a prime number");

           }  else{
               System.out.println(n +"is not prime number");
           }
    }
    }

    private static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i< Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
