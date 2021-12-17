package Alphabets;
import java.util.Scanner;
public class TriangleCharacter15 {
    public static void main(String args[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Enter the number of rows");
    int rows=scan.nextInt();
    int i,j;
    i=rows;
    while(i>=1){
        j=i;
        while(j>=1){
            System.out.print((char)(j+64)+(" "));
            j--;
        }
        i--;
        System.out.println();
    }
}
}
}
