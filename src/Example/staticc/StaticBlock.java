package Example.staticc;
// This is a example to show to init the static variables

public class StaticBlock {
    static  int a = 10;
    static int b;
// will only run once , when the first obj is created i.e  when the class is loaded for the first time .
    static {
        System.out.println("this is the static block");
        b = a*2;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);

    }

}
