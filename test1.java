public class test1 {
    static void method(){
      test1 t = new test1();
       t.method2();
        System.out.println("it is method ");
    }
    void method2(){
        method3();
        System.out.println("it is method2 ");
    }
       void method3(){ 
        method4();
        System.out.println("it is method3");
    }
    static void method4(){
        System.out.println("it is method4");
    }
    public static void main(String[] args) {
        System.out.println("main method start");
         method();
        System.out.println("main method end");
    }
}
