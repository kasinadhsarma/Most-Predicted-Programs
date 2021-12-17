package Alphabets;
import java.util.Scanner;
public class TriangleCharacter17 {
    public static void main(String args[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Enter the number of rows");
    int rows=scan.nextInt();
    int i,j,num,count;
    i=1;
    while(i<=rows){
        
        j=1;
        while(j<=(i*2-1)){
            System.out.print((char)(j+64)+(" "));
            j++;
        }
        i++;
        System.out.println();
    }
}
}
}
