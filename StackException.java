public class StackException {

    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        methodA();
    }
}