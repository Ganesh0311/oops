
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        float x,y;
        System.out.print("Enter the value of x : ");
        x = input.nextFloat();
        System.out.print("Enter the value of y: ");
        y = input.nextFloat();
        System.out.print("The operations are: \n1.Addition, 2.Subtraction, 3.Multiplication, 4.Division\n");
        System.out.print("Enter the choice: ");
        choice = input.nextInt();
        if(choice == 1)
        {
            System.out.print("The Addition of "+ x +" and "+ y +" is "+(x+y));
        }
        else if(choice == 2)
        {
            System.out.print("The Subtraction of "+ x +" and "+ y +" is "+(x-y));   
        }
        else if(choice == 3)
        {
             System.out.print("The Multiplication of "+ x +" and "+ y +" is "+(x*y));
        }
        else if(choice == 4)
        {
            
             System.out.print("The Division of "+ x +" and "+ y +" is "+(x/y));
        }
        else 
        {
            System.out.println("Inavid choice");
        }
    }
}
