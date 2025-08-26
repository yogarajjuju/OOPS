package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
       try{
//           int c = a/b;

       } catch (Exception e){
           System.out.println(e.getMessage());
       } finally { // no matter what this will always run in the program
           System.out.println("This will always execute ");
       }
    }
}
