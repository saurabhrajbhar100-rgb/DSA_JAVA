import java.io.*;
class BufferReader {
 
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string ");

        String s=br.readLine();
        System.out.println("You enterd " +s);
    }
}
