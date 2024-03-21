public class overriding {
    void display()
    {
        System.out.println("Iam King kohli");
    }
}
class child extends overriding {
    void display()
    {
        System.out.println("Iam akayyyyyy");
    }
}
class Brooo{
    public static void main(String[] args){
        overriding obj1 = new overriding ();
        obj1.display();
        child obj2 = new child();
        obj2.display();
    }
}
