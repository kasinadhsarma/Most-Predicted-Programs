public class Factorials {
    public static void main(String[]args){
        int i,fact=1;
        int number=5;//Idhi factorial enta kavalo anta chesukovatam
        for(i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+"is:"+fact);
    }
}
