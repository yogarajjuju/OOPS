package Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }
    // NOTE:  Final keyword is used to prevent overiding
    //        we cannot over ride a method that is declared as final;
    //        It is also called as latebinding

    @Override// this one override the default toString();
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(22);
        System.out.println(obj.num);
    }
}
