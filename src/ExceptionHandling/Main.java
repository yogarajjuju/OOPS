package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
       try{
//           int c = a/b;
           divide(a,b);

       } catch (Exception e){
           System.out.println(e.getMessage());
       } finally { // no matter what this will always run in the program
           System.out.println("This will always execute ");
       }
    }
    static int  divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;

    }

}
