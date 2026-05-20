
public class Statement {
    void show(){
        System.out.println("it show method");
    }
    static void hello(){
        System.out.println("it static method");
    } 
    {
        System.out.println("it is instance block");
    }
    static{
        System.out.println("it is static block");
    }
    public static void main(String[] args) {
        System.out.println("main method ");
        Statement s = new Statement();
        s.show();
        hello();
        System.out.println("it is main method end ");


    }
}
