package Alphabets;
import java.util.Scanner;
public class TriangleCharacter16 {
public static void main(String args[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Enter the number of rows");
    int rows=scan.nextInt();
    int i,j,num,count;
    i=1;
    while(i<=rows){
        num=rows-1;
        count=i;
        
        j=1;
        while(j<=i){
            System.out.print((char)(count+64)+(" "));
            count=count+num;
            num--;
            j++;
        }
        i++;
        System.out.println();
    }
}
}
}