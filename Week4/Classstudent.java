// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class student3{
    public 
        String collegeName="MVGR";
        int collegeCode=33;
        student3(){
            System.out.println("Collegename : "+collegeName+"\nCollegecode : "+collegeCode);
        }
        student3(String fullName, double semPerentage){
            System.out.println("Name : "+fullName+"\nCollegecode : "+semPerentage);
        }
        String fullName;
        double semPercentage;

}
public class classstudent {
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student3 Ganesh=new student3();
        System.out.print("Enter name :");
        Ganesh.fullName=op.next();
        System.out.print("Enter Sempercentage :");
        Ganesh.semPercentage=op.nextInt();
        op.close();
        student3 hi=new student3(Ganesh.fullName,Ganesh.semPercentage);

    }

}
