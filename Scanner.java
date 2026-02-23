import java.util.Scanner;

class ScannerExample{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println("You Entered String: " + s);

        System.out.print("Enter Integer: ");
        int x = sc.nextInt();
        System.out.println("You Entered Integer: " + x);

        System.out.print("Enter Float: ");
        float f = sc.nextFloat();
        System.out.println("You Entered Float: " + f);
    }
    
}