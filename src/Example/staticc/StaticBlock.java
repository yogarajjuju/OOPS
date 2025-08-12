package Example.staticc;

public class StaticBlock {
    static  int a = 10;
    static int b;

    static {
        System.out.println("this is the static block");
        b = a*2;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
    }

}
