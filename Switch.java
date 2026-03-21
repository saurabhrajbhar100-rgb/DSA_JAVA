import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        int x = 0, y = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter moves (e.g., LRUD): ");

        String moves = sc.nextLine().toUpperCase();

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            switch (move) {
                case 'L': x--; break;
                case 'R': x++; break;
                case 'U': y++; break;
                case 'D': y--; break;
                default: System.out.println("Invalid move: " + move);
            }
        }

        System.out.println("Final Position: " + x + " " + y);

        sc.close();
    }
}