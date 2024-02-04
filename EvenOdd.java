import java.lang.System;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int sum = input.nextInt();
        evenodd(sum);
        input.close();
    }
    public static void evenodd(int sum){
        if(sum % 2==0){
            System.out.println(sum + "is a Even number");
        }else{
            System.out.println(sum + "is a Odd number");
        
        }
      }
 }
