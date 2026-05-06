public class Function2 {

    public static void main(String[] args) {

        System.out.println("Main Begin");

        fun();

        System.out.println("Main End");

        fun();
    }

    public static void fun() {
        System.out.println("Fun1 Begin");

        fun2();

        System.out.println("Fun1 End");
    }

    public static void fun2() {
        System.out.println("Inside fun2");
    }
}