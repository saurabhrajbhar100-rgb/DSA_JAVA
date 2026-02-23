public class argument {
    public static void main(String[] args) {
        
        if(args. length >0){

            System.out.println("Arguments are ");
            for(String n:args)
                System.out.println(n+"");

        }
        else
            System.out.println("No Arguments ");
    }
}
