import java.util.Scanner;
class student2{
    public 
        student2(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student1{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student2 Ganesh=new student2();
        System.out.println("Enter your name :");
        Ganesh.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        Ganesh.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        Ganesh.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        Ganesh.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        Ganesh.collegeCode=op.nextInt();
        System.out.println("Name : "+Ganesh.fullName+"\nRoll number : "+Ganesh.rollNum+"\nSempercentage : "+Ganesh.semPerentage+"\nCollegename : "+Ganesh.collegeName+"\nCollegecode : "+Ganesh.collegeCode);

    }
}
