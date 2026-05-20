public class test {
    static void room1(){
        System.out.println("it is room1");
           room4();
         test r = new test();
           r.room2();
           r.room3();
    }
    
    void room2(){
        System.out.println("it is room2");
    }
    void room3(){
        System.out.println("it is room3 ");
    }
    static void room4(){
        System.out.println("it is a room4");
           test r = new test();
           r.room2();
    }
    public static void main(String[] args) {
        System.out.println("main method");
        room1(); 
        System.out.println("main method end");  
    }
    
}
